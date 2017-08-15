package com.csgi.cms.modules.cms.dao;

import com.csgi.cms.common.persistence.CrudDao;
import com.csgi.cms.common.persistence.annotation.MyBatisDao;
import com.csgi.cms.modules.cms.entity.Guestbook;

/**
 * 留言DAO接口
 */
@MyBatisDao
public interface GuestbookDao extends CrudDao<Guestbook> {

}
