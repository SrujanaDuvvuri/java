package com.mtc.dao;

import java.util.List;

import com.mtc.vo.Product;

public interface IProductDAO {
	
	void add(Product product);
	Product findById(int id);
	List<Product> findAll();
	int update(Product product);
	int delete(int id);
	float maxPrice();
	List<Object[]>findAllByNamePrice();
}
