package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet accepts one parameter and forwards to JSP
 */
public class JS009 extends HttpServlet {

	/**
	 * @endpoint: /JS009
	 * @method: GET
	 * @params: a
	 * @template: /WEB-INF/jsp/servlets/js009.jsp
	 * @description: servlet with one parameter and JSP
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		request.setAttribute("a", a);
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js009.jsp").forward(request, response);
	}
}
