package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet using WebServlet annotation
 */
@WebServlet("/JS014")
public class JS014 extends HttpServlet {

	/**
	 * @endpoint: /JS014
	 * @method: GET
	 * @template: /WEB-INF/jsp/servlets/js014.jsp
	 * @description: servlet from WebServlet annotation
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/jsp/servlets/js014.jsp").forward(request, response);
	}

}
