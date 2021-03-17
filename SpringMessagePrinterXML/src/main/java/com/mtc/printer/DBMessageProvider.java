package com.mtc.printer;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

public class DBMessageProvider implements IMessageDAO {

	
	public String fetchMessage() {
		System.out.println("From db message provider");
		return "DB Message: .....";
	}

	
}
