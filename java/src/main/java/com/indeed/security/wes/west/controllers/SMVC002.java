package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SMVC002 {

	/**
	 * @endpoint: /SMVC002
	 * @method: POST
	 * @template: /WEB-INF/jsp/controllers/smvc002.jsp
	 * @description: spring POST request
	 */
	@RequestMapping(value = "/SMVC002", method = RequestMethod.POST) 
	public String post() {
		return "/WEB-INF/jsp/controllers/smvc002.jsp";
	}
}
