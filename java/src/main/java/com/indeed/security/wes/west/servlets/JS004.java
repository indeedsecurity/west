package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Java Servlet accepts one parameter and returns via response stream
 */
public class JS004 extends HttpServlet {

	/**
	 * @endpoint: /JS004
	 * @method: GET
	 * @params: a
	 * @description: servlet with one parameter
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>" + this.getServletName() + "</title>");
		out.println("  </head>");
		out.println("<body>");
		out.println("  <p>Parameter \"one\": " + ((a==null)? "" : StringEscapeUtils.escapeHtml(a)) + "</p>");
		out.println("</body>");
		out.print("</html>");
	}

	/**
	 * @endpoint: /JS004
	 * @method: POST
	 * @params: a
	 * @description: servlet with one parameter
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
