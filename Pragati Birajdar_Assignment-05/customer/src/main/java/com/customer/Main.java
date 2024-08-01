package com.customer;

public class Main {
    public static void main(String[] args) {
        CustomerDAO dao = new CustomerDAO();

        
        Customer customer = new Customer("Suresh", "pp@.com", "789456123");
        
        dao.saveOrUpdate(customer);
        System.out.println("Customer created: " + customer);
 
        Customer customers = dao.getById(customer.getId());
        System.out.println("Retrieved customer: " + customers);
 
        customers.setName("Manan");
        dao.saveOrUpdate(customers);
        System.out.println("Updated customer: " + customers);
  
        dao.delete(customers.getId());
        System.out.println("Deleted Customer ");

        Customer deletedCustomer = dao.getById(customers.getId());
        System.out.println("Deleted customer: " + deletedCustomer);
    }
}
