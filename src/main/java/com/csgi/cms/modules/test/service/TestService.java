package com.csgi.cms.modules.test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csgi.cms.common.service.CrudService;
import com.csgi.cms.modules.test.entity.Test;
import com.csgi.cms.modules.test.dao.TestDao;

/**
 * 测试Service
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
