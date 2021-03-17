package com.mtc.dao;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mtc.vo.Product;

@Repository
public class ProductDAO implements IProductDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ProductRowMapper productRowMapper;
	
	@Autowired
	private ProductNameClassRowMapper productNameClassRowMapper;
	
	private static final String INSERT_QUERY = "insert into sys.product(id,name,price,description,quantity) values(?,?,?,?,?)";
	private static final String SELECT_QUERY = "select * from sys.product where id=?";
	private static final String SELECT_ALL_QUERY = "select * from sys.product";
	private static final String UPDATE_QUERY = "UPDATE sys.product set id=?, name=?, price=?,description=? where id =?";
	private static final String DELETE_QUERY = "DELETE from sys.product where id=?";
	private static final String MAX_PRICE = "SELECT Max(price) FROM sys.product";
	private static final String SELECT_NAME_PRICE = "select name, price from sys.product";
	
	@Override
	public void add(Product product) {
		int noOfRows = jdbcTemplate.update(INSERT_QUERY, product.getId(), product.getName(), product.getPrice(),product.getDescription(),product.getQuantity());
		if(noOfRows >0) {
			System.out.println("Records added succesfully");
		}
		else {
			System.out.println("Couldn't add a record, try again");
		}
	}

	@Override
	public Product findById(int id) {
		Product product = jdbcTemplate.queryForObject(SELECT_QUERY, productRowMapper, id);
		return product;
	}

	@Override
	public List<Product> findAll() {
		List<Product> allProducts = jdbcTemplate.query(SELECT_ALL_QUERY, productRowMapper);
				return allProducts;
	}

	@Override
	public int update(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float maxPrice() {
		float maxPrice = jdbcTemplate.queryForObject(MAX_PRICE, Float.class);
		return maxPrice;
	}

	@Override
	public List<Object[]> findAllByNamePrice() {
		
		List<Object[]> allProducts = jdbcTemplate.query(SELECT_NAME_PRICE, productNameClassRowMapper);
		return allProducts;
	}
	

}



