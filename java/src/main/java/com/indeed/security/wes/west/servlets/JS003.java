package com.indeed.security.wes.west.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Java Servlet accepts GET or POST requests
 */
public class JS003 extends HttpServlet {

	/**
	 * @endpoint: /JS003
	 * @method: GET
	 * @description: servlet for GET and POST requests
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("  <head>");
		out.println("    <title>" + this.getServletName() + "</title>");
		out.println("  </head>");
		out.println("<body>");
		out.println("  <p>GET or POST requests</p>");
		out.println("</body>");
		out.print("</html>");
	}
	
	/**
	 * @endpoint: /JS003
	 * @method: POST
	 * @description: servlet for GET and POST requests
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
