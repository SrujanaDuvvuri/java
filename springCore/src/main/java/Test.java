import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mtc.beans.SampleBean;

public class Test {
//why are you working all day?
	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.mtc");
		SampleBean sampleBean = applicationContext.getBean(SampleBean.class) ;
		sampleBean.greet();
	}

}
