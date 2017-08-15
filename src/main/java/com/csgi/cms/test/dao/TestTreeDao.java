package com.csgi.cms.test.dao;

import com.csgi.cms.common.persistence.TreeDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}