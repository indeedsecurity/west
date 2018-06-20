package com.indeed.security.wes.west.common;

import javax.servlet.http.HttpServletRequest;

public class Methods {

	public static String smvcten_two_lone(HttpServletRequest request) {
		return request.getParameter("b");
	}
	
	public static String smvcten_five_lone(HttpServletRequest request) {
		return request.getParameter("e");
	}
}
