package com.csgi.cms.test.dao;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.test.entity.TestDataChild;

/**
 * 主子表生成DAO接口
 */
@MyBatisDao
public interface TestDataChildDao extends CrudDao<TestDataChild> {
	
}