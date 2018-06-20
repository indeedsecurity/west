package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet forwards to JSP with three parameters
 */
public class JS012 extends HttpServlet {

	/**
	 * @endpoint: /JS012
	 * @method: GET
	 * @params: a, b, c
	 * @template: /WEB-INF/jsp/servlets/js012.jsp
	 * @description: servlet with JSP containing three parameters
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js012.jsp").forward(request, response);
	}

}
