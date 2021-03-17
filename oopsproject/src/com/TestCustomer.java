package com;

import java.time.LocalDate;

public class TestCustomer {

	public static void main(String[] args) {

		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		customer1.setId(1);
		customer1.setEmail("test1@gmail.com");
		customer1.setDob(LocalDate.of(1996, 10, 12));
		customer1.setName("Srujana");
		customer1.setGender(Gender.FEMALE);
		
		customer2.setId(2);
		customer2.setEmail("test2@gmail.com");
		customer2.setDob(LocalDate.of(2014, 3, 31));
		customer2.setName("Adrija");
		customer2.setGender(Gender.FEMALE);
		
		customer3.setId(3);
		customer3.setEmail("test3@gmail.com");
		customer3.setDob(LocalDate.of(1996, 10, 12));
		customer3.setName("Satya");
		customer3.setGender(Gender.MALE);
		
		System.out.println("Customer1 details.. "
				+ "\n" + "Name:" + customer1.getName() + "\n Gender:" + customer1.getGender());
		System.out.println("Customer2 details.. \n" + "Name:" + customer2.getName() + "\n Gender:" + customer2.getGender());
		System.out.println("Customer3 details.. \n" + "Name:" + customer3.getName() + "\n Gender:" + customer3.getGender());

	}

}
