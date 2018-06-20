package com.indeed.security.wes.west.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.indeed.security.wes.west.common.Parameters;

@Controller
@RequestMapping("/SMVC006")
public class SMVC006 {
	
	private final String SMVC006_03_PARAM = "c";
	private final String SMVC006_05_PARAM = "f";
	private final String SMVC006_07_PARAM_I = "i";
	private final String SMVC006_07_PARAM_J = "j";
	private final String SMVC006_08_PARAM_K = "k";
	private final String SMVC006_08_PARAM_L = "l";
	private final String SMVC006_08_PARAM_M = "m";

	/**
	 * @endpoint: /SMVC006/01
	 * @params: a
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: RequestParam without value attribute
	 */
	@RequestMapping("/01")
	public String one(@RequestParam("a") String a) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/02
	 * @params: b
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: RequestParam with name attribute
	 */
	@RequestMapping("/02")
	public String two(@RequestParam(name="b", required=false) String b) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/03
	 * @params: c
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: RequestParam with Member Reference from class
	 */
	@RequestMapping("/03")
	public String three(@RequestParam(SMVC006_03_PARAM) String c) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/04
	 * @params: d
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: RequestParam with Member Reference from import
	 */
	@RequestMapping("/04")
	public String four(@RequestParam(Parameters.SMVC006_04_PARAM) String d) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/05
	 * @params: e, f, g
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: RequestParam from Literal, Member Reference from class, Member Reference from import
	 */
	@RequestMapping("/05")
	public String five(@RequestParam("e") String e,
						@RequestParam(SMVC006_05_PARAM) String f,
						@RequestParam(Parameters.SMVC006_05_PARAM) String g) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/06
	 * @params: h
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: parameter without RequestParam annotation
	 */
	@RequestMapping("/06")
	public String six(String h) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/07
	 * @params: ij
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: parameter from Member References as Binary Operation
	 */
	@RequestMapping("/07")
	public String seven(@RequestParam(SMVC006_07_PARAM_I + SMVC006_07_PARAM_J) String ij) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/08
	 * @params: klm
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: parameter from Member References as two Binary Operations
	 */
	@RequestMapping("/08")
	public String eight(@RequestParam(SMVC006_08_PARAM_K + SMVC006_08_PARAM_L + SMVC006_08_PARAM_M) String klm) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/09
	 * @params: n
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: parameter with empty RequestParam annotation
	 */
	@RequestMapping("/09")
	public String nine(@RequestParam String n) {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
	
	/**
	 * @endpoint: /SMVC006/10
	 * @params: o
	 * @template: /WEB-INF/jsp/controllers/smvc006.jsp
	 * @description: parameter in RequestMapping annotation
	 */
	@RequestMapping(value = "/10", params = "o")
	public String ten() {
		return "/WEB-INF/jsp/controllers/smvc006.jsp";
	}
}
