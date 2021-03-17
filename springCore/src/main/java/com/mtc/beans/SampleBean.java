package com.mtc.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtc.dao.MessageDAO;

@Component
public class SampleBean {
	
	@Autowired
	private MessageDAO messageDAO;

	public void greet() {
		System.out.println("Hello from bean!!!");
		System.out.println(messageDAO.fetchMessage());
	}
}