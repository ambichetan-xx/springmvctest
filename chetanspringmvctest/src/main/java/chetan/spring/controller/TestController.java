package chetan.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import chetan.spring.model.TestModel;

@Controller
public class TestController {

	@RequestMapping(value = "/testwelcome")
	public ModelAndView handlerWelcomeRequest() {
		ModelAndView modelView = new ModelAndView("testwelcome");
		TestModel testModel = new TestModel();
		modelView.addObject("testmodel", testModel);
		return modelView;
	}

	@RequestMapping(value = "/testsubmit")
	public ModelAndView handlerTestSubmitRequest(
			@ModelAttribute TestModel testModel) {
		ModelAndView modelView = new ModelAndView("testsubmitresult");
		modelView.addObject("testname", testModel.getTestName());
		return modelView;
	}

}
