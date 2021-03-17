package com.mtc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(description = "Registration form related action", urlPatterns = { "/RegisterProcess" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    
//    public RegisterServlet() {
//        super();
//    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("In doGet of register servlet");
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String city = request.getParameter("city");

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h2>You are Registered Succesfully</h2>");
		out.println("<p>");
		out.println("FirstName : " + firstName);
		out.println("</p>");
		out.println("<p>");
		out.println("LastName : " + lastName);
		out.println("</p>");

		out.println("<p>");
		out.println("Email : " + email);
		out.println("</p>");
		
		
		out.println("<p>");
		out.println("City : " + city);
		out.println("</p>");
		out.println("</body></html>");
	}

}
