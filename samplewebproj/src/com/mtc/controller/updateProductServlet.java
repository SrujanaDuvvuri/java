package com.mtc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.dao.ProductDAO;
import com.mtc.vo.Product;

@WebServlet("/updaterecord")
public class updateProductServlet extends HttpServlet{

	private static final long serialVersionUID = 6548609886019896811L;

//@Override
//protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	// TODO Auto-generated method stub
//	super.doOptions(req, resp);
//}	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("hello there3W");
		System.out.println("id"+request.getParameter("productId"));
		System.out.println("name"+request.getParameter("name"));
		System.out.println("price"+request.getParameter("price"));
		System.out.println("desc"+request.getParameter("desc"));
		
		int pid = Integer.parseInt(request.getParameter("productId"));
		String name = request.getParameter("name");
		float price = Float.parseFloat(request.getParameter("price"));
		String desc = request.getParameter("desc");
		
		System.out.println(pid + name + price + desc);
		try {
		Product product = new Product();
		product.setId(pid);
		product.setName(name);
		product.setPrice(price);
		product.setDescription(desc);
		
		ProductDAO p = new ProductDAO();
		int noOfRecords = p.update(product);
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		if(noOfRecords > 0) {
		out.println("<h2 align='center'>Records updated successfully</h2>");
		}else {
			out.println("<h2 align='center'>No updates made!!</h2>");
		}
		out.println("</table></div>");
		out.println("</body></html>");
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
}
