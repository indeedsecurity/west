package com.indeed.security.wes.west.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.indeed.security.wes.west.common.Methods;

@Controller
@RequestMapping("/SMVC010")
public class SMVC010 {

	private final String SMVC010_03_PARAM = "c";
	private final String SMVC010_07_PARAM = "g";
	private final String SMVC010_09_PARAM = "i";
	private final String SMVC010_11_VIEW = "/WEB-INF/jsp/controllers/smvc010.jsp";
	
	/**
	 * @endpoint: /SMVC010/01
	 * @params: a
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method from class with parameter as Literal
	 */
	@RequestMapping("/01")
	public String one(HttpServletRequest request, HttpServletResponse response) {
		final String a = smvcten_one_lone(request);
		request.setAttribute("p", a);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";
	}
	
	/**
	 * @endpoint: /SMVC010/02
	 * @params: b
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method from import with parameter as Literal
	 */
	@RequestMapping("/02")
	public String two(HttpServletRequest request, HttpServletResponse response) {
		final String b = Methods.smvcten_two_lone(request);
		request.setAttribute("p", b);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/03
	 * @params: c
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method from class with parameter as Member Reference from class
	 */
	@RequestMapping("/03")
	public String three(HttpServletRequest request, HttpServletResponse response) {
		final String c = smvcten_three_lone(request);
		request.setAttribute("p", c);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/04
	 * @params: d
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: two wrapper methods from class with parameter as Literal
	 */
	@RequestMapping("/04")
	public String four(HttpServletRequest request, HttpServletResponse response) {
		final String d = smvcten_four_ltwo(request);
		request.setAttribute("p", d);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/05
	 * @params: e
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: one wrapper method from class and one wrapper method from import
	 */
	@RequestMapping("/05")
	public String five(HttpServletRequest request, HttpServletResponse response) {
		final String e = smvcten_five_ltwo(request);
		request.setAttribute("p", e);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/06
	 * @params: f
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method from class with parameter as argument Literal
	 */
	@RequestMapping("/06")
	public String six(HttpServletRequest request, HttpServletResponse response) {
		final String f = smvcten_six_lone(request, "f");
		request.setAttribute("p", f);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/07
	 * @params: g
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method from class with parameter as argument Member Reference
	 */
	@RequestMapping("/07")
	public String seven(HttpServletRequest request, HttpServletResponse response) {
		final String g = smvcten_seven_lone(request, SMVC010_07_PARAM);
		request.setAttribute("p", g);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/08
	 * @params: h
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: two wrapper methods with parameter as argument Literal
	 */
	@RequestMapping("/08")
	public String eight(HttpServletRequest request, HttpServletResponse response) {
		final String h = smvcten_eight_ltwo(request, "h");
		request.setAttribute("p", h);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/09
	 * @params: i
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: two wrapper methods with parameter as argument Member Reference
	 */
	@RequestMapping("/09")
	public String nine(HttpServletRequest request, HttpServletResponse response) {
		final String i = smvcten_nine_ltwo(request, SMVC010_09_PARAM);
		request.setAttribute("p", i);
		return "/WEB-INF/jsp/controllers/smvc010.jsp";	
	}
	
	/**
	 * @endpoint: /SMVC010/10
	 * @params: j
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method with view as Literal
	 */
	@RequestMapping("/10")
	public String ten(@RequestParam("j") String j, 
					   HttpServletRequest request, 
					   HttpServletResponse response) {
		request.setAttribute("p", j);
		return smvcten_ten_lone();
	}
	
	/**
	 * @endpoint: /SMVC010/11
	 * @params: k
	 * @template: /WEB-INF/jsp/controllers/smvc010.jsp
	 * @description: wrapper method with view as Member Reference from class
	 */
	@RequestMapping("/11")
	public String eleven(@RequestParam("k") String k, 
					   HttpServletRequest request, 
					   HttpServletResponse response) {
		request.setAttribute("p", k);
		return smvcten_eleven_lone();
	}
	
	private String smvcten_ten_lone() {
		return "/WEB-INF/jsp/controllers/smvc010.jsp";
	}
	
	private String smvcten_eleven_lone() {
		return SMVC010_11_VIEW;
	}
	
	private String smvcten_one_lone(HttpServletRequest request) {
		return request.getParameter("a");
	}
	
	private String smvcten_three_lone(HttpServletRequest request) {
		return request.getParameter(SMVC010_03_PARAM);
	}
	
	private String smvcten_four_ltwo(HttpServletRequest request) {
		final String d = smvcten_four_lone(request);
		return d;
	}
	
	private String smvcten_four_lone(HttpServletRequest request) {
		return request.getParameter("d");
	}
	
	private String smvcten_five_ltwo(HttpServletRequest request) {
		final String e = Methods.smvcten_five_lone(request);
		return e;
	}
	
	private String smvcten_six_lone(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}
	
	private String smvcten_seven_lone(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}
	
	private String smvcten_eight_ltwo(HttpServletRequest request, String param) {
		final String h = smvcten_eight_lone(request, param);
		return h;
	}
	
	private String smvcten_eight_lone(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}
	
	private String smvcten_nine_ltwo(HttpServletRequest request, String param) {
		final String i = smvcten_nine_lone(request, param);
		return i;
	}
	
	private String smvcten_nine_lone(HttpServletRequest request, String param) {
		return request.getParameter(param);
	}
}
