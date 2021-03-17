package com.mtc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.dao.ProductDAO;
import com.mtc.vo.Product;

@WebServlet("/deleterecord")
public class deleteProductServlet extends HttpServlet{

		private static final long serialVersionUID = -3217401462930035416L;

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			System.out.println("hello there1");
			System.out.println(request.getParameter("productId"));
			int pid = Integer.parseInt(request.getParameter("productId"));

			System.out.println("here" +pid);
			try {
				
				ProductDAO productDAO = new ProductDAO();
				int numberOfRows = productDAO.delete(pid);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			if(numberOfRows > 0) {
			out.println("<h2 align='center'>Records deleted successfully</h2>");
			}else {
				out.println("<h2 align='center'>No Records found</h2>");
			}
			
			out.println("</table></div>");
			out.println("</body></html>");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

