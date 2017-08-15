package com.csgi.cms.modules.act.dao;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.act.entity.Act;

/**
 * 审批DAO接口
 */
@MyBatisDao
public interface ActDao extends CrudDao<Act> {

	public int updateProcInsIdByBusinessId(Act act);
	
}
