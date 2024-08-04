package com.customer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");

		Customer customer1 = new Customer(1, "Pranav", "pranav@example.com", "8956325852");
        System.out.println("Successfully Added 1" +customer1);
        Customer customer2 = new Customer(2, "Abhi", "abhi@example.com", "7523692145");
        System.out.println("Successfully Added 2" +customer2);
        customerService.addCustomer(customer1);
        System.out.println("Successfully Added 1" +customer1);

        customerService.addCustomer(customer2);
        System.out.println("Successfully Added 2"+customer2);

        
        Customer retrievedCustomer = customerService.getCustomerById(1);
        if (retrievedCustomer != null) {
            System.out.println("Retrieved Customer: " + retrievedCustomer.getName() + " (" + retrievedCustomer.getEmail() + ")");
        } else {
            System.out.println("Customer not found");
        }
		List<Customer> allCustomers = customerService.getAllCustomers();
		System.out.println("All Customers:");
		for (Customer customer : allCustomers) {
            System.out.println(customer);
        }
	}
}