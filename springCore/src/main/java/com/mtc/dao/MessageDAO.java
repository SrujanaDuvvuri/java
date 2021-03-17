package com.mtc.dao;

import org.springframework.stereotype.Component;

@Component
public class MessageDAO {

	public String fetchMessage() {
		return "DB message";
	}
}
