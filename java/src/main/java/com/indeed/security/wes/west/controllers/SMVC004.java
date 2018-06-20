package com.indeed.security.wes.west.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/SMVC004", method = RequestMethod.GET)
public class SMVC004 {

	/**
	 * @endpoint: /SMVC004/01
	 * @method: GET
	 * @params: a
	 * @template: /WEB-INF/jsp/controllers/smvc004-01.jsp
	 * @description: one parameter from RequestParam annotation
	 */
	@RequestMapping("/01")
	public String one(@RequestParam(name="a", required=false) String a,
						HttpServletRequest request,
						HttpServletResponse response) {
		request.setAttribute("a", a);
		return "/WEB-INF/jsp/controllers/smvc004-01.jsp";
	}
	
	/**
	 * @endpoint: /SMVC004/02
	 * @method: GET
	 * @params: b, c
	 * @template: /WEB-INF/jsp/controllers/smvc004-02.jsp
	 * @description: two parameters from RequestParam annotaiton
	 */
	@RequestMapping("/02")
	public String two(@RequestParam(name="b", required=false) String b,
						@RequestParam(name="c", required=false) String c,
						HttpServletRequest request,
						HttpServletResponse response) {
		request.setAttribute("b", b);
		request.setAttribute("c", c);
		return "/WEB-INF/jsp/controllers/smvc004-02.jsp";
	}
	
	/**
	 * @endpoint: /SMVC004/03
	 * @method: GET
	 * @params: d, e, f
	 * @template: /WEB-INF/jsp/controllers/smvc004-03.jsp
	 * @description: three parameters from RequestParam annotation
	 */
	@RequestMapping("/03")
	public String three(@RequestParam(name="d", required=false) String d,
						@RequestParam(name="e", required=false) String e,
						@RequestParam(name="f", required=false) String f,
						HttpServletRequest request,
						HttpServletResponse response) {
		request.setAttribute("d", d);
		request.setAttribute("e", e);
		request.setAttribute("f", f);
		return "/WEB-INF/jsp/controllers/smvc004-03.jsp";
	}
	
	/**
	 * @endpoint: /SMVC004/04
	 * @method: GET
	 * @params: g, h
	 * @template: /WEB-INF/jsp/controllers/smvc004-04.jsp
	 * @description: one parameter from RequestParam annotation and one parameter from getParameter()
	 */
	@RequestMapping("/04")
	public String four(@RequestParam(name="g", required=false) String g,
						HttpServletRequest request,
						HttpServletResponse response) {
		String h = request.getParameter("h");
		request.setAttribute("g", g);
		request.setAttribute("h", h);
		return "/WEB-INF/jsp/controllers/smvc004-04.jsp";
	}
	
	/**
	 * @endpoint: /SMVC004/05
	 * @method: GET
	 * @params: i, j, k
	 * @template: /WEB-INF/jsp/controllers/smvc004-05.jsp
	 * @description: one parameter from RequestParam annotation, one parameter from getParameter(), one parameter from JSP
	 */
	@RequestMapping("/05")
	public String five(@RequestParam(name="i", required=false) String i,
						HttpServletRequest request,
						HttpServletResponse response) {
		String j = request.getParameter("j");
		request.setAttribute("i", i);
		request.setAttribute("j", j);
		return "/WEB-INF/jsp/controllers/smvc004-05.jsp";
	}
}
