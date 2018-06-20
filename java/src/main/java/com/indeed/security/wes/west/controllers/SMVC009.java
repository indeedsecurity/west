package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/SMVC009")
public class SMVC009 extends SMVC009Abstract {

	/**
	 * @endpoint: /SMVC009/06
	 * @method: GET
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: subclass endpoint for GET requests
	 */
	@RequestMapping(value = "/06", method = RequestMethod.GET)
	public String six() {
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	/**
	 * @endpoint: /SMVC009/07
	 * @method: GET
	 * @params: a
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: subclass endpoint with parameter from RequestParam
	 */
	@RequestMapping(value = "/07", method = RequestMethod.GET)
	public String seven(@RequestParam("a") String a) {
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
}
