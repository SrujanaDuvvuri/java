package com.mtc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/transfer")
public class TransferServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String otp = request.getParameter("otp");
		System.out.println("received otp" + otp);
		
		int amt = Integer.parseInt(request.getParameter("amt"));
		System.out.println("amount" + amt);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("amt", amt);
		
		response.sendRedirect("Verify.jsp");
	
	}

}
