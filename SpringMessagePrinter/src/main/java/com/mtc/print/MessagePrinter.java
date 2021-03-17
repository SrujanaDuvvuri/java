package com.mtc.print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mtc.printer.DBMessageProvider;
import com.mtc.printer.FileMessageProvider;
import com.mtc.printer.IMessageDAO;

@Component
public class MessagePrinter {

	@Autowired
	private DBMessageProvider dbMessageProvider;
	
	@Autowired
	private FileMessageProvider fileMessageProvider;
	
	@Autowired
	private IMessageDAO messageDAO;
	
	public void printMessage() {
		System.out.println(dbMessageProvider.fetchMessage());
		System.out.println(fileMessageProvider.fetchMessage());
		System.out.println(messageDAO.fetchMessage());
	}
}
