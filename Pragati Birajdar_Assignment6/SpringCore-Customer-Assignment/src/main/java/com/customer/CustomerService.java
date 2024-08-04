package com.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
	List<Customer> customerList = new ArrayList<Customer>();
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}

	public Customer getCustomerById(int id) {
		for (Customer customer : customerList) {
			if (customer.getId() == id) {
                return customer;
            }
		}
		return null;
	}

	public List<Customer> getAllCustomers() {
		return new ArrayList<>(customerList);
	}
}