package com.csgi.cms.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.csgi.cms.common.config.Global;
import com.csgi.cms.common.persistence.Page;
import com.csgi.cms.common.web.BaseController;
import com.csgi.cms.common.utils.StringUtils;
import com.csgi.cms.test.entity.TestDataMain;
import com.csgi.cms.test.service.TestDataMainService;

/**
 * 主子表生成Controller
 */
@Controller
@RequestMapping(value = "${adminPath}/test/testDataMain")
public class TestDataMainController extends BaseController {

	@Autowired
	private TestDataMainService testDataMainService;

	@ModelAttribute
	public TestDataMain get(@RequestParam(required = false) String id) {
		TestDataMain entity = null;
		if (StringUtils.isNotBlank(id)) {
			entity = testDataMainService.get(id);
		}
		if (entity == null) {
			entity = new TestDataMain();
		}
		return entity;
	}

	@RequiresPermissions("test:testDataMain:view")
	@RequestMapping(value = { "list", "" })
	public String list(TestDataMain testDataMain, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		Page<TestDataMain> page = testDataMainService.findPage(new Page<TestDataMain>(request, response), testDataMain);
		model.addAttribute("page", page);
		return "jeesite/test/testDataMainList";
	}

	@RequiresPermissions("test:testDataMain:view")
	@RequestMapping(value = "form")
	public String form(TestDataMain testDataMain, Model model) {
		model.addAttribute("testDataMain", testDataMain);
		return "jeesite/test/testDataMainForm";
	}

	@RequiresPermissions("test:testDataMain:edit")
	@RequestMapping(value = "save")
	public String save(TestDataMain testDataMain, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, testDataMain)) {
			return form(testDataMain, model);
		}
		testDataMainService.save(testDataMain);
		addMessage(redirectAttributes, "保存主子表成功");
		return "redirect:" + Global.getAdminPath() + "/test/testDataMain/?repage";
	}

	@RequiresPermissions("test:testDataMain:edit")
	@RequestMapping(value = "delete")
	public String delete(TestDataMain testDataMain, RedirectAttributes redirectAttributes) {
		testDataMainService.delete(testDataMain);
		addMessage(redirectAttributes, "删除主子表成功");
		return "redirect:" + Global.getAdminPath() + "/test/testDataMain/?repage";
	}

}