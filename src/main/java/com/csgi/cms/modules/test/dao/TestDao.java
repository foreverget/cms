package com.csgi.cms.modules.test.dao;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.test.entity.Test;

/**
 * 测试DAO接口
 */
@MyBatisDao
public interface TestDao extends CrudDao<Test> {
	
}
