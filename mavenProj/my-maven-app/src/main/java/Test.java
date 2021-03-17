import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mtc.config.AppConfig;
import com.mtc.dao.ProductDAO;
import com.mtc.vo.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductDAO pd = ac.getBean(ProductDAO.class);
		pd.add(new Product(4, "SamsungS2", 1200, "phone", 30));
		
		Product product = pd.findById(12);
		
		System.out.println(product);
		List<Product> products = pd.findAll();
		for (Product p : products) {
			System.out.println(p);
		}
		float maxPrice = pd.maxPrice();
		System.out.println(maxPrice);
		
		List<Object[]> objArr = pd.findAllByNamePrice();
		for (Object[] objects : objArr) {
			System.out.println("Name: " +objects[0] + " Price: " + objects[1]);
		}
	}
}
