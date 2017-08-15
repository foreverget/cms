package com.csgi.cms.modules.sys.dao;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.sys.entity.Log;

/**
 * 日志DAO接口
 */
@MyBatisDao
public interface LogDao extends CrudDao<Log> {

}
