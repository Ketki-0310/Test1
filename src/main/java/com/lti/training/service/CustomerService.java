package com.lti.training.service;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.CustomerDao;
import com.lti.training.dto.customerDto;
import com.lti.training.dto.customerLoginDto;
import com.lti.training.entity.Customer;


@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public void add(Customer customer) {
		System.out.println("entered the add customer method in the customer service class");

		System.out.println("entering the customer dao class");
		System.out.println("HELLO\t " + customer.getFirstname());

		customerDao.add(customer);
	}

	public Customer fetch(int id) {
		return customerDao.fetch(id);
	}
//sdkjfbsdjf
	// to verify the customer credentials
	public boolean verify(customerLoginDto customerLoginDto) {
		String email = customerLoginDto.getEmail();
		String password = customerLoginDto.getPassword();
		boolean flag = false;

		List<Customer> customerList = customerDao.fetchAll();

		for (Customer x : customerList) {
			if (email.equals(x.getEmail())) {
				if (password.equals(x.getPassword())) {
					flag = true;
				}
			}
		}
		return flag;
	}

	
}
