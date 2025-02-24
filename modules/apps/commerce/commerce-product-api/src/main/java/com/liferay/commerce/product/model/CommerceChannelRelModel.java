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

package com.liferay.commerce.product.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.AttachedModel;
import com.liferay.portal.kernel.model.AuditedModel;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CommerceChannelRel service. Represents a row in the &quot;CommerceChannelRel&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.commerce.product.model.impl.CommerceChannelRelModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.commerce.product.model.impl.CommerceChannelRelImpl</code>.
 * </p>
 *
 * @author Marco Leo
 * @see CommerceChannelRel
 * @generated
 */
@ProviderType
public interface CommerceChannelRelModel
	extends AttachedModel, AuditedModel, BaseModel<CommerceChannelRel>,
			MVCCModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a commerce channel rel model instance should use the {@link CommerceChannelRel} interface instead.
	 */

	/**
	 * Returns the primary key of this commerce channel rel.
	 *
	 * @return the primary key of this commerce channel rel
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this commerce channel rel.
	 *
	 * @param primaryKey the primary key of this commerce channel rel
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this commerce channel rel.
	 *
	 * @return the mvcc version of this commerce channel rel
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this commerce channel rel.
	 *
	 * @param mvccVersion the mvcc version of this commerce channel rel
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the commerce channel rel ID of this commerce channel rel.
	 *
	 * @return the commerce channel rel ID of this commerce channel rel
	 */
	public long getCommerceChannelRelId();

	/**
	 * Sets the commerce channel rel ID of this commerce channel rel.
	 *
	 * @param commerceChannelRelId the commerce channel rel ID of this commerce channel rel
	 */
	public void setCommerceChannelRelId(long commerceChannelRelId);

	/**
	 * Returns the company ID of this commerce channel rel.
	 *
	 * @return the company ID of this commerce channel rel
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this commerce channel rel.
	 *
	 * @param companyId the company ID of this commerce channel rel
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this commerce channel rel.
	 *
	 * @return the user ID of this commerce channel rel
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this commerce channel rel.
	 *
	 * @param userId the user ID of this commerce channel rel
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this commerce channel rel.
	 *
	 * @return the user uuid of this commerce channel rel
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this commerce channel rel.
	 *
	 * @param userUuid the user uuid of this commerce channel rel
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this commerce channel rel.
	 *
	 * @return the user name of this commerce channel rel
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this commerce channel rel.
	 *
	 * @param userName the user name of this commerce channel rel
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this commerce channel rel.
	 *
	 * @return the create date of this commerce channel rel
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this commerce channel rel.
	 *
	 * @param createDate the create date of this commerce channel rel
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this commerce channel rel.
	 *
	 * @return the modified date of this commerce channel rel
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this commerce channel rel.
	 *
	 * @param modifiedDate the modified date of this commerce channel rel
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the fully qualified class name of this commerce channel rel.
	 *
	 * @return the fully qualified class name of this commerce channel rel
	 */
	@Override
	public String getClassName();

	public void setClassName(String className);

	/**
	 * Returns the class name ID of this commerce channel rel.
	 *
	 * @return the class name ID of this commerce channel rel
	 */
	@Override
	public long getClassNameId();

	/**
	 * Sets the class name ID of this commerce channel rel.
	 *
	 * @param classNameId the class name ID of this commerce channel rel
	 */
	@Override
	public void setClassNameId(long classNameId);

	/**
	 * Returns the class pk of this commerce channel rel.
	 *
	 * @return the class pk of this commerce channel rel
	 */
	@Override
	public long getClassPK();

	/**
	 * Sets the class pk of this commerce channel rel.
	 *
	 * @param classPK the class pk of this commerce channel rel
	 */
	@Override
	public void setClassPK(long classPK);

	/**
	 * Returns the commerce channel ID of this commerce channel rel.
	 *
	 * @return the commerce channel ID of this commerce channel rel
	 */
	public long getCommerceChannelId();

	/**
	 * Sets the commerce channel ID of this commerce channel rel.
	 *
	 * @param commerceChannelId the commerce channel ID of this commerce channel rel
	 */
	public void setCommerceChannelId(long commerceChannelId);

	@Override
	public CommerceChannelRel cloneWithOriginalValues();

}