package com.mtc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mtc.dao.IProductDAO;
import com.mtc.dao.ProductDAO;
import com.mtc.vo.Product;

@WebServlet("/findallproducts")
public class findAllProductsServlet extends HttpServlet{

	private static final long serialVersionUID = -3217401462930035416L;
	private static final String SELECT_QUERY = "select * from test.product where id=?";
	IProductDAO productDAO = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		 productDAO = new ProductDAO();

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			List<Product> products = productDAO.findAll();
		
			RequestDispatcher rd = request.getRequestDispatcher("ProductsView.jsp");
			
			request.setAttribute("ProductsList", products);
			rd.forward(request, response);
		
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html><body>");
//		out.println("<h2 align='center'>Product Record</h2>");
//		out.println("<div align=center><table border=2>");
//		out.println("<tr>");
//			out.print("<th>ProductId</th><th>Name</th><th>Price</th><th>Description</th><th colspan=\"2\">Action</th>");
//		out.println("</tr>");
//		for(Product product: products){
//			int id=product.getId();
//			out.println("<tr>");
//			out.println("<td>"+id+"</td>");
//			out.println("<td>"+product.getName()+"</td>");
//			out.println("<td>"+product.getPrice()+"</td>");
//			out.println("<td>"+product.getDescription()+"</td>");
//			out.println("<td>"+"<form action=\"editrecord\"><input type=\"submit\" value=\"EDIT\"/><input type=\"hidden\" name=\"productId\" value="+ id +"><input type=\"hidden\" name=\"name\" value="+ product.getName()+ "><input type=\"hidden\" name=\"price\" value="+ product.getPrice()+ "><input type=\"hidden\" name=\"desc\" value="+ product.getDescription()+ "></form>"+"</td>");
//			out.println("<td>"+"<form action=\"deleterecord\"><input type=\"submit\" value=\"DELETE\"/><input type=\"hidden\" name=\"productId\" value=" + id+"></form>"+"</td>");
//		out.println("</tr>");
//		}
//		
//		out.println("</table></div>");
//		out.println("</body></html>");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void destroy() {
		//cleanup code
		
	}
}
