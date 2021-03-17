package com.mtc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
@Component("productNameClassRowMapper")
public class ProductNameClassRowMapper implements RowMapper<Object[]>{

	@Override
	public Object[] mapRow(ResultSet rs, int rowNum) throws SQLException {
		Object[] objArr = new Object[2];
		
		objArr[0]= rs.getString("name");
		objArr[1]= rs.getFloat("price");
		return objArr;
	}
	

}
