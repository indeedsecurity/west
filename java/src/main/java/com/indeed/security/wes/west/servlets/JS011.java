package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet accepts one parameter and forwards to JSP with one parameter
 */
public class JS011 extends HttpServlet {

	/**
	 * @endpoint: /JS011
	 * @method: GET
	 * @params: a, b
	 * @template: /WEB-INF/jsp/servlets/js011.jsp
	 * @description: servlet with one parameter and JSP containing one parameter
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		request.setAttribute("a", a);
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js011.jsp").forward(request, response);
	}

}
