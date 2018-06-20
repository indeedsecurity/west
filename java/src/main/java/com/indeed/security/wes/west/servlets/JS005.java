package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringEscapeUtils;

/**
 * Java Servlet accepts two parameters and returns via response stream
 */
public class JS005 extends HttpServlet {
	
	/**
	 * @endpoint: /JS005
	 * @method: GET
	 * @params: a, b
	 * @description: servlet with two parameters
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>" + this.getServletName() + "</title>");
		out.println("  </head>");
		out.println("<body>");
		out.println("  <p>Parameter \"one\": " + ((a==null)? "" : StringEscapeUtils.escapeHtml(a)) + "</p>");
		out.println("  <p>Parameter \"two\": " + ((b==null)? "" : StringEscapeUtils.escapeHtml(b)) + "</p>");
		out.println("</body>");
		out.print("</html>");
	}

	/**
	 * @endpoint: /JS005
	 * @method: POST
	 * @params: a, b
	 * @description: servlet with two parameters
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
