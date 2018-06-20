package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet with JSP as Member Reference
 */
public class JS013 extends HttpServlet {

	private final String JSP = "/WEB-INF/jsp/servlets/js013.jsp";

	/**
	 * @endpoint: /JS013
	 * @method: GET
	 * @template: /WEB-INF/jsp/servlets/js013.jsp
	 * @description: servlet with JSP as Member Reference
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(JSP).forward(request, response);
	}

	/**
	 * @endpoint: /JS013
	 * @method: POST
	 * @template: /WEB-INF/jsp/servlets/js013.jsp
	 * @description: servlet with JSP as Member Reference
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher(JSP).forward(request, response);
	}

}
