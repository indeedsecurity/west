package com.indeed.security.wes.west.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public abstract class SMVC009Abstract {
	
	private final String SMVC009_04_PATH = "/04";
	
	/**
	 * @endpoint: /SMVC009/01
	 * @method: GET
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: abstract endpoint for GET requests
	 */
	@RequestMapping(value = "/01", method = RequestMethod.GET)
	public String one() {
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	/**
	 * @endpoint: /SMVC009/02
	 * @method: GET
	 * @params: a
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: abstract endpoint with parameter from RequestParam
	 */
	@RequestMapping(value = "02", method = RequestMethod.GET)
	public String two(@RequestParam(value = "a", required = false) String a) {
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	/**
	 * @endpoint: /SMVC009/03
	 * @method: GET
	 * @params: b
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: abstract endpoint with parameter from getParameter()
	 */
	@RequestMapping(value = "03", method = RequestMethod.GET)
	public String three(HttpServletRequest request, HttpServletResponse response) {
		final String b = request.getParameter("b");
		request.setAttribute("b", b);
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	/**
	 * @endpoint: /SMVC009/04
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: abstract endpoint with path as Member Reference from class
	 */
	@RequestMapping(SMVC009_04_PATH)
	public String four() {
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	/**
	 * @endpoint: /SMVC009/05
	 * @params: c
	 * @template: /WEB-INF/jsp/controllers/smvc009.jsp
	 * @description: abstract endpoint with parameter from wrapper method
	 */
	@RequestMapping("/05")
	public String five(HttpServletRequest request, HttpServletResponse response) {
		final String c = getStringParameter(request, "c");
		request.setAttribute("c", c);
		return "/WEB-INF/jsp/controllers/smvc009.jsp";
	}
	
	private String getStringParameter(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}
}
