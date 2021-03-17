package messageprinter;

public class MessagePrinter {

	private FileMessageProvider fileMessageProvider;
	private DBMessageProvider dbMessageProvider;
	private NewDBMessageProvider newDBMessageProvider;


	public MessagePrinter() {
		fileMessageProvider = new FileMessageProvider();
		dbMessageProvider = new DBMessageProvider();
		newDBMessageProvider = new NewDBMessageProvider();
	}

	public void printMessage(String source) {
		switch (source) {
		
			case "file":
				System.out.println(fileMessageProvider.fetchFileMessage());
				break;
			case "db":
				System.out.println(dbMessageProvider.fetchDBMessage());
				break;
			case "newdb":
				System.out.println(newDBMessageProvider.fetchNewDBMessage());
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}

}
