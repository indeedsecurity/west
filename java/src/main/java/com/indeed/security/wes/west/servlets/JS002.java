package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java Servlet accepts POST request
 */
public class JS002 extends HttpServlet {

	/**
	 * @endpoint: /JS002
	 * @method: POST
	 * @description: servlet for POST requests
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>" + this.getServletName() + "</title>");
		out.println("  </head>");
		out.println("<body>");
		out.println("  <p>POST request</p>");
		out.println("</body>");
		out.print("</html>");
	}

}
