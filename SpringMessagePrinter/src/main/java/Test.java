import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mtc.print.MessagePrinter;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mtc");
		MessagePrinter messagePrinter = applicationContext.getBean(MessagePrinter.class);
		messagePrinter.printMessage();
	}

}
