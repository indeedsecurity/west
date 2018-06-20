package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet forwards to JSP with one parameter
 */
public class JS010 extends HttpServlet {

	/**
	 * @endpoint: /JS010
	 * @method: GET
	 * @params: a
	 * @template: /WEB-INF/jsp/servlets/js010.jsp
	 * @description: servlet with JSP containing one parameter
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js010.jsp").forward(request, response);
	}

}
