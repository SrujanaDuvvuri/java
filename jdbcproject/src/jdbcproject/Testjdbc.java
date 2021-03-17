package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Testjdbc {

	private static final String insertQuery = "insert into sys.product(id, name, price, description, quantity) values(?,?,?,?,?)";
	private static final String selectQuery = "select * from sys.product where id = ?";
	private static final String selectAllQuery = "select * from sys.product"; 

	public static void addProduct(Product product) {
		try {
			//Step1: Establish Connection
//			Class.forName("com.mysql.jdbc.Driver");


			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "Root@123");
			
			//Step2: Prepare statement
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			//Step3: Load values
			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setInt(5, product.getQuantity());
//			preparedStatement.setInt(6, product.getSupplier_id());
			
			//Step 4: Execute query
			int noOfRows = preparedStatement.executeUpdate();
			
			if(noOfRows == 1) {
				System.out.println("Record added Successfuly");
			}
			connection.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static Product findById(int id)  {
		Product product = null;

		//try using resources
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false", "root", "Root@123")){
			PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
			preparedStatement.setInt(1, id);
			ResultSet rs =  preparedStatement.executeQuery();
			if(rs.next()) {
				product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getFloat("price"));
				product.setDescription(rs.getString("description"));
				product.setQuantity(rs.getInt("quantity"));
				
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return product;
	}
	public static List<Product> findAll(){
		List<Product> productList = new ArrayList<Product>();

		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?useSSL=false", "root", "Root@123")){
			//No binding parameter is used here. So we use Statement
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(selectAllQuery);
			while(rs.next()) {
				Product product = new Product();
				product.setId(rs.getInt("id"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getFloat("price"));
				product.setDescription(rs.getString("description"));
				product.setQuantity(rs.getInt("quantity"));
				
				productList.add(product);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return productList;

	}
	public static void main(String[] args) {
		addProduct(new Product(24, "Samsung S8", 300, "SmartPhone", 12));
		System.out.println("\n");
		Product product = null;
		product = findById(2);
		System.out.println(product);
//		List<Product> products = findAll();
//		for(Product product: products) {
//			System.out.println(product);
//			
//		}

	}

}
