package com.mtc.printer;

import org.springframework.stereotype.Component;

public class FileMessageProvider implements IMessageDAO {

	public String fetchMessage() {
		System.out.println("From filemessage provider");
		return "File Message: .....";
	}

}
