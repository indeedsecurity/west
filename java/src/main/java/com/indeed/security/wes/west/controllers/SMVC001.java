package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SMVC001 {

	/**
	 * @endpoint: /SMVC001
	 * @method: GET
	 * @template: /WEB-INF/jsp/controllers/smvc001.jsp
	 * @description: spring GET request
	 */
	@RequestMapping(value = "/SMVC001", method = RequestMethod.GET)
	public String get() {
		return "/WEB-INF/jsp/controllers/smvc001.jsp";
	}
}
