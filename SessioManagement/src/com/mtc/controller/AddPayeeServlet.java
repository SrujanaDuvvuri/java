package com.mtc.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mtc.model.Payee;

/**
 * Servlet implementation class AddPayeeServlet
 */
@WebServlet("/addPayeeServlet")
public class AddPayeeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Payee payee =  new Payee();
		payee.setName(request.getParameter("name"));
		payee.setAccountNo(request.getParameter("accno"));
		payee.setBranchCode(request.getParameter("bname"));
		
		System.out.println("Account created" + payee.toString());
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("payee", payee);
		
		response.sendRedirect("transfer.jsp");
	}

}
