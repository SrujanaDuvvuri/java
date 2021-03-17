package com.mtc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mtc.vo.Product;

public class ProductDAO extends BaseDAO implements IProductDAO{
	
	private static final String insertQuery = "insert into sys.product(id,name,price,description,quantity) values(?,?,?,?,?)";
    //1,2,3,4,5
	private static final String SELECT_QUERY = "select * from sys.product where id=?";
	private static final String SELECT_ALL_QUERY = "select * from sys.product";
	private static final String UPDATE_QUERY = "UPDATE sys.product set id=?, name=?, price=?,description=? where id =?";
	private static final String DELETE_QUERY = "DELETE from sys.product where id=?";
	


	@Override
	public void add(Product product) {
		try (Connection connection = getConnection()){
			
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1,product.getId());
			preparedStatement.setString(2,product.getName());
			preparedStatement.setFloat(3, product.getPrice());
			preparedStatement.setString(4, product.getDescription());
			preparedStatement.setInt(5,product.getQuantity());
			
			//Step4 : execute the query
			int noOfRows = preparedStatement.executeUpdate();
		
			//Step5 : validating results
			if(noOfRows == 1) {
				System.out.println("Record added successfully");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

	private Product toProduct(ResultSet resultSet) {
		Product product = null;		
	
		try {
			product = new Product();
			product.setId(resultSet.getInt("id"));
			product.setName(resultSet.getString("name"));
			product.setPrice(resultSet.getFloat("price"));
			product.setDescription(resultSet.getString("description"));
			product.setQuantity(resultSet.getInt("quantity"));				

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return product;
	}
	
	@Override
	public Product findById(int id) {
		Product product = null;		
		try(Connection connection = getConnection()){			
			//Step2  :  PreparedStatement object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY);			
			preparedStatement.setInt(1,id);			
			ResultSet resultSet = preparedStatement.executeQuery();			
			if(resultSet.next()) {
				product = toProduct(resultSet);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> productsList = new ArrayList<Product>();
		
		try(Connection connection = getConnection()){			
			Statement statement = connection.createStatement();			
			ResultSet resultSet = statement.executeQuery(SELECT_ALL_QUERY);			
			while(resultSet.next()) {
				Product product = new Product();
				product = toProduct(resultSet);
				productsList.add(product);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return productsList;
	}

	@Override
	public int update(Product product) {
		int noOfRows = 0;
		
		try(Connection connection = getConnection()){
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_QUERY);
			preparedStatement.setInt(1,product.getId());
			preparedStatement.setString(2,product.getName());
			preparedStatement.setFloat(3,product.getPrice());
			preparedStatement.setString(4,product.getDescription());
			preparedStatement.setInt(5,product.getId());

			noOfRows = preparedStatement.executeUpdate();
		
			if(noOfRows > 0) {
				System.out.println("Record(s) updated successfully");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return noOfRows;

	}

	@Override
	public int delete(int id) {
		int noOfRows = 0;
		try (Connection connection = getConnection()){
			PreparedStatement preparedStatement = connection.prepareStatement(DELETE_QUERY);
			preparedStatement.setInt(1,id);
			
			noOfRows = preparedStatement.executeUpdate();
		
			if(noOfRows >= 1) {
				System.out.println("Record(s) removed successfully");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

		return noOfRows;
	}

}



