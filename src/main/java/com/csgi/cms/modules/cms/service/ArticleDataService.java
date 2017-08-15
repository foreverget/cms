package com.csgi.cms.modules.cms.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.csgi.cms.common.service.CrudService;
import com.csgi.cms.modules.cms.dao.ArticleDataDao;
import com.csgi.cms.modules.cms.entity.ArticleData;

/**
 * 站点Service
 */
@Service
@Transactional(readOnly = true)
public class ArticleDataService extends CrudService<ArticleDataDao, ArticleData> {

}
