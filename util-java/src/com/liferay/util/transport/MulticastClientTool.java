/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.util.transport;

import com.liferay.petra.string.StringBundler;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * A client that listens for multicast messages at a designated port. You may
 * use this to for potential multicast issues when tuning distributed caches.
 * </p>
 *
 * @author Michael C. Han
 * @author Raymond Augé
 */
public class MulticastClientTool {

	public static void main(String[] args) {
		try {
			new MulticastClientTool(args);
		}
		catch (Exception exception) {
			exception.printStackTrace();

			System.err.println(
				StringBundler.concat(
					"Usage: java -classpath util-java.jar ",
					MulticastClientTool.class.getName(),
					"[-g] [-s] -h [multicastAddress] -p [port] [-b] ",
					"[bindAddress]"));

			System.exit(1);
		}
	}

	private MulticastClientTool(String[] args) throws Exception {
		Map<String, Object> argsMap = _getArgsMap(args);

		Integer port = (Integer)argsMap.get("port");
		String multicastAddress = (String)argsMap.get("multicastAddress");
		String bindAddress = (String)argsMap.get("bindAddress");

		Boolean gzipData = (Boolean)argsMap.get("gzip");
		Boolean shortData = (Boolean)argsMap.get("short");

		DatagramHandler datagramHandler = new MulticastDatagramHandler(
			gzipData.booleanValue(), shortData.booleanValue());

		MulticastTransport multicastTransport = new MulticastTransport(
			datagramHandler, multicastAddress, port, bindAddress);

		if (shortData.booleanValue()) {
			System.out.println("Truncating to 96 bytes.");
		}

		System.out.println("Started up and waiting...");

		multicastTransport.connect();

		synchronized (multicastTransport) {
			multicastTransport.wait();
		}
	}

	private Map<String, Object> _getArgsMap(String[] args) throws Exception {
		Map<String, Object> argsMap = new HashMap<>();

		for (int i = 0; i < args.length; i++) {
			if (args[i].equals("-g")) {
				argsMap.put("gzip", Boolean.TRUE);
			}
			else if (args[i].equals("-s")) {
				argsMap.put("short", Boolean.TRUE);
			}
			else if (args[i].equals("-h")) {
				argsMap.put("multicastAddress", args[i + 1]);

				i++;
			}
			else if (args[i].equals("-p")) {
				argsMap.put("port", Integer.valueOf(args[i + 1]));

				i++;
			}
			else if (args[i].equals("-b")) {
				argsMap.put("bindAddress", args[i + 1]);

				i++;
			}
		}

		if (!argsMap.containsKey("gzip")) {
			argsMap.put("gzip", Boolean.FALSE);
		}

		if (!argsMap.containsKey("short")) {
			argsMap.put("short", Boolean.FALSE);
		}

		return argsMap;
	}

}