package colletionProj;

import java.time.LocalDate;

import vo.Customer;

public class TestCust {

	public static void main(String[] args) {

		Customer[] customers = new Customer[4];
		customers[0] = new Customer(111, "Hary", LocalDate.of(1990, 01, 10));
		customers[1] = new Customer(112, "Kumar", LocalDate.of(1980, 06, 12));
		customers[2] = new Customer(113, "Archana", LocalDate.of(1985, 12, 1));
		customers[3] = new Customer(114, "Rachel", LocalDate.of(1991, 04, 20));

		for (Customer customer : customers) {
			System.out.println("Customers: " +customer.toString());
		}
	}

}
