package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SMVC008")
public class SMVC008 {
	
	/**
	 * @endpoint: /SMVC008/01/(?P<one>[^/]*)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: one PathVariable
	 */
	@RequestMapping("/01/{one}")
	public String one(@PathVariable("one") String one) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/02/(?P<one>[^/]*)/(?P<two>[^/]*)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: two PathVariables
	 */
	@RequestMapping("/02/{one}/{two}")
	public String two(@PathVariable("one") String one, @PathVariable("two") String two) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/03/(?P<one>[a-zA-Z0-9]+)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: one PathVariable with regular expression
	 */
	@RequestMapping("/03/{one:[a-zA-Z0-9]+}")
	public String three(@PathVariable("one") String one) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/04/(?P<one>[a-zA-Z]+)/(?P<two>[0-9]+)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: two PathVariables with regular expressions
	 */
	@RequestMapping("/04/{one:[a-zA-Z]+}/{two:[0-9]+}")
	public String four(@PathVariable("one") String one, @PathVariable("two") int two) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/05/(?P<one>[^/]*)/(?P<two>[a-zA-Z0-9_-]+)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: two PathVariables with only one regular expression
	 */
	@RequestMapping("/05/{one}/{two:[a-zA-Z0-9_-]+}")
	public String five(@PathVariable("one") String one, @PathVariable("two") String two) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/06/(?P<one>[a-zA-Z]{3})
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: one PathVariable with regular expression using quantifier
	 */
	@RequestMapping("/06/{one:[a-zA-Z]{3}}")
	public String six(@PathVariable("one") String one) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/07/(?P<one>[^/]*)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: one PathVariable without annotation value
	 */
	@RequestMapping("/07/{one}")
	public String seven(@PathVariable String one) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
	
	/**
	 * @endpoint: /SMVC008/08/(?P<one>[a-zA-Z]+)-(?P<two>[0-9]+)
	 * @template: /WEB-INF/jsp/controllers/smvc008.jsp
	 * @description: two PathVariables in same path element
	 */
	@RequestMapping("/08/{one:[a-zA-Z]+}-{two:[0-9]+}")
	public String eight(@PathVariable("one") String one, @PathVariable("two") int two) {
		return "/WEB-INF/jsp/controllers/smvc008.jsp";
	}
}
