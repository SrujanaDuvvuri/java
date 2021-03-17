//package messageprinter;
//
//public class MessagePrinter2 {
//
////	private FileMessageProvider fileMessageProvider;
////	private DBMessageProvider dbMessageProvider;
////	private NewDBMessageProvider newDBMessageProvider;
////
////
////	public MessagePrinter2() {
////		fileMessageProvider = new FileMessageProvider();
////		dbMessageProvider = new DBMessageProvider();
////		newDBMessageProvider = new NewDBMessageProvider();
////	}
//
//	public void printMessage(String source) {
//			
//		String filesource = source.substring(0, 1).toUpperCase() + source.substring(1);
//		String messageProvider = source + "MessageProvider";
//		String fileSourceMessageProvider = filesource + "MessageProvider";
//		
//		switch (source) {
//		
//			case "file":
//				System.out.println(fileMessageProvider.fetchFileMessage());
//				break;
//			case "db":
//				System.out.println(dbMessageProvider.fetchDBMessage());
//				break;
//			case "newdb":
//				System.out.println(newDBMessageProvider.fetchNewDBMessage());
//				break;
//			default:
//				System.out.println("Invalid input");
//				break;
//		}
//	}
//
//}
