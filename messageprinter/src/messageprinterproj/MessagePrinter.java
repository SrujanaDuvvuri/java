package messageprinterproj;

public class MessagePrinter {
	
	private IMessageProvider messageProvider;
	
	public MessagePrinter() {
		//todo
	}

	public void setMessageProvider(IMessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}
	
	public void printMessage() {
		System.out.println("***Printing message****");
		System.out.println(messageProvider.fetchMessage());
	}
	
}
