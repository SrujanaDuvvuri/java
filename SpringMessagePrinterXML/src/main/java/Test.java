import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mtc.print.MessagePrinter;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
	}

}
