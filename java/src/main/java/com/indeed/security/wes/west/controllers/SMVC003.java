package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SMVC003 {

	/**
	 * @endpoint: /SMVC003
	 * @method: GET, POST
	 * @template: /WEB-INF/jsp/controllers/smvc003.jsp
	 * @description: spring GET and POST request
	 */
	@RequestMapping(value = "/SMVC003", method = {RequestMethod.GET, RequestMethod.POST})
	public String getAndPost() {
		return "/WEB-INF/jsp/controllers/smvc003.jsp";
	}
}
