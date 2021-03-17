package com.mtc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.vo.Product;

@WebServlet("/editrecord")
public class editProductServlet extends HttpServlet {

	private static final long serialVersionUID = 6548609886019896811L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("hello there2");
		System.out.println("id" + request.getParameter("productId"));
		System.out.println("name" + request.getParameter("name"));
		System.out.println("price" + request.getParameter("price"));
		System.out.println("desc" + request.getParameter("desc"));

		int pid = Integer.parseInt(request.getParameter("productId"));
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));
		String desc = request.getParameter("desc");

		System.out.println(pid + name + price + desc);

		try {
			PrintWriter out = response.getWriter();

			out.println("<html><body>");
			out.println("<h2 align='center'>Edit Record</h2>");
			out.println("<form action='updaterecord'>");
			out.println("<div align=center><table border=2>");
			
			out.println("<tr>");
			out.print("<td>ProductId</td>");
			out.print("<td><input type=\"text\" name=\"productId\" value=" + pid + "></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.print("<td>Name</td>");
			out.print("<td><input type=\"text\" name=\"name\" value=" + name + "></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.print("<td>Price</td>");
			out.print("<td><input type=\"text\" name=\"price\" value=" + price + "></td>");
			out.println("</tr>");

			out.println("<tr>");
			out.print("<td>Description</td>");
			out.print("<td><input type=\"text\" name=\"desc\" value=" + desc + "></td>");
			out.println("</tr>");
			
			out.println("<tr>");
			out.print("<td><input type=\"submit\"  value='UPDATE'></td>");
			out.println("</tr>");
			
			out.println("</table></div></form>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
