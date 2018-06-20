package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet forwards to JSP
 */
public class JS008 extends HttpServlet {

	/**
	 * @endpoint: /JS008
	 * @method: POST
	 * @template: /WEB-INF/jsp/servlets/js008.jsp
	 * @description: servlet with JSP
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js008.jsp").forward(request, response);
	}
}
