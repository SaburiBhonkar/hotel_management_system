package com.jsp.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class TestSaveCustomer {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomer_name("SALMANKHAN");
		customer.setCustomer_phnone_num("9765431256");
		customer.setCustomer_aadhar_num("675432545666");
		CustomerService customerService = new CustomerService();
		customerService.create(customer);
	}
}
