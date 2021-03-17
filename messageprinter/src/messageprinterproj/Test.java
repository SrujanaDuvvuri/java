package messageprinterproj;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Enter the source name: ");
		Scanner scanner =  new Scanner(System.in);
		String sourceName = scanner.next();
		MessagePrinter messagePrinter =  new MessagePrinter();
		switch (sourceName) {
		case "file":
			fileMessageProvider messageProvider =  new fileMessageProvider();
			messagePrinter.setMessageProvider(messageProvider);
			messagePrinter.printMessage();
			break;
		case "db":
			DBMessageProvider dbmessageProvider =  new DBMessageProvider();
			messagePrinter.setMessageProvider(dbmessageProvider);
			messagePrinter.printMessage();
			break;
		default:
			System.out.println("invalid input");
			break;
		}
	}

}
