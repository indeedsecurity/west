package com.indeed.security.wes.west.controllers;

import com.indeed.security.wes.west.common.Paths;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/SMVC005")
public class SMVC005 {
	
	private final String SMVC005_02_PATH = "/02";
	private final String SMVC005_08_SLASH = "/";
	private final String SMVC005_09_SLASH = "/";
	private final String SMVC005_09_ZERO = "0";
	
	/**
	 * @endpoint: /SMVC005
	 * @method: GET
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping specifying GET
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String get() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005
	 * @method: POST
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping specifying POST
	 */
	@RequestMapping(method = RequestMethod.POST)
	public String post() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/01
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping with Literal value
	 */
	@RequestMapping(value = "01")
	public String one() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/02
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping with Member Reference from class
	 */
	@RequestMapping(value = SMVC005_02_PATH)
	public String two() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/03
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping with Member Reference from import
	 */
	@RequestMapping(value = Paths.SMVC005_03_PATH)
	public String three() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/04, /SMVC005/05
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping with multiple values
	 */
	@RequestMapping(value = {"/04","/05"})
	public String fourAndFive() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/06
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping without value or path attribute
	 */
	@RequestMapping("/06")
	public String six() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/07
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping with path attribute
	 */
	@RequestMapping(path = "/07")
	public String seven() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/08
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping from string concatentation with Member Reference from class
	 */
	@RequestMapping(SMVC005_08_SLASH + "08")
	public String eight() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
	
	/**
	 * @endpoint: /SMVC005/09
	 * @template: /WEB-INF/jsp/controllers/smvc005.jsp
	 * @description: RequestMapping from multiple string concatentations with Member Refernces from class
	 */
	@RequestMapping(SMVC005_09_SLASH + SMVC005_09_ZERO + "9")
	public String nine() {
		return "/WEB-INF/jsp/controllers/smvc005.jsp";
	}
}
