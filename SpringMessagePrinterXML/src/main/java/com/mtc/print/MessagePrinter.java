package com.mtc.print;

//import com.mtc.printer.DBMessageProvider;
//import com.mtc.printer.FileMessageProvider;
import com.mtc.printer.IMessageDAO;

public class MessagePrinter {

//	private DBMessageProvider dbMessageProvider;
//	
//	private FileMessageProvider fileMessageProvider;
	
	private IMessageDAO messageDAO;
	
	public void printMessage() {
//		System.out.println(dbMessageProvider.fetchMessage());
//		System.out.println(fileMessageProvider.fetchMessage());
		System.out.println(messageDAO.fetchMessage());
	}

	public void setMessageDAO(IMessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}
}
