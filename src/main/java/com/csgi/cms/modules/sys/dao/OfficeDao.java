package com.csgi.cms.modules.sys.dao;

import com.csgi.cms.common.persistence.TreeDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.sys.entity.Office;

/**
 * 机构DAO接口
 */
@MyBatisDao
public interface OfficeDao extends TreeDao<Office> {
	
}
