package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.indeed.security.wes.west.common.Views;

@Controller
@RequestMapping("/SMVC007")
public class SMVC007 {
	
	private final String SMVC007_02_VIEW = "/WEB-INF/jsp/controllers/smvc007.jsp";
	private final String SMVC007_05_VIEW = "/WEB-INF/jsp/controllers/smvc007.jsp";
	private final String SMVC007_07_PREFIX = "/WEB-INF/jsp/controllers/";
	private final String SMVC007_08_PREFIX = "/WEB-INF/jsp/controllers/";
	private final String SMVC007_08_SUFFIX = ".jsp";
	
	/**
	 * @endpoint: /SMVC007/01
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as string Literal
	 */
	@RequestMapping("/01")
	public String one() {
		return "/WEB-INF/jsp/controllers/smvc007.jsp";
	}
	
	/**
	 * @endpoint: /SMVC007/02
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as Member Reference from class 
	 */
	@RequestMapping("/02")
	public String two() {
		return SMVC007_02_VIEW;
	}
	
	/**
	 * @endpoint: /SMVC007/03
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as Member Reference from import
	 */
	@RequestMapping("/03")
	public String three() {
		return Views.SMVC007_03_VIEW;
	}
	
	/**
	 * @endpoint: /SMVC007/04
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as ModelAndView with Literal
	 */
	@RequestMapping("/04")
	public ModelAndView four() {
		return new ModelAndView("/WEB-INF/jsp/controllers/smvc007.jsp");
	}
	
	/**
	 * @endpoint: /SMVC007/05
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as ModelAndView with Member Reference from class
	 */
	@RequestMapping("/05")
	public ModelAndView five() {
		return new ModelAndView(SMVC007_05_VIEW);
	}
	
	/**
	 * @endpoint: /SMVC007/06
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as ModelAndView with Member Reference from import
	 */
	@RequestMapping("/06")
	public ModelAndView six() {
		return new ModelAndView(Views.SMVC007_06_VIEW);
	}
	
	/**
	 * @endpoint: /SMVC007/07
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as string concatentation with Literal
	 */
	@RequestMapping("/07")
	public String seven() {
		return SMVC007_07_PREFIX + "smvc007.jsp";
	}
	
	/**
	 * @endpoint: /SMVC007/08
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as multiple string concatentations with Member References from class
	 */
	@RequestMapping("/08")
	public String eight() {
		return SMVC007_08_PREFIX + "smvc007" + SMVC007_08_SUFFIX;
	}
	
	/**
	 * @endpoint: /SMVC007/09
	 * @template: /WEB-INF/jsp/controllers/smvc007.jsp
	 * @description: view as string concatenation with Member Reference from import
	 */
	@RequestMapping("/09")
	public String nine() {
		return Views.SMVC007_09_PREFIX + "smvc007.jsp";
	}
}
