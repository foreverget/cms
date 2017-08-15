package com.csgi.cms.modules.cms.dao;

import java.util.List;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.cms.entity.Link;

/**
 * 链接DAO接口
 */
@MyBatisDao
public interface LinkDao extends CrudDao<Link> {
	
	public List<Link> findByIdIn(String[] ids);
	
	public int updateExpiredWeight(Link link);

//	public List<Link> fjindListByEntity();
}
