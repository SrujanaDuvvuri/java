package com.mtc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class updateServlet
 */
@WebServlet("/updateserv")
public class updateServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("from req" + request.getParameter("amt"));
		HttpSession httpSession = request.getSession();
		System.out.println("from session" + httpSession.getAttribute("amt"));
		
	}

}
