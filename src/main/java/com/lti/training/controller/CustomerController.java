package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.lti.training.dto.customerLoginDto;
import com.lti.training.entity.Customer;
import com.lti.training.service.CustomerService;

@RestController
@CrossOrigin
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping(path = "/customer/add", method = RequestMethod.POST)
	public String add(@RequestBody Customer customer) {
		System.out.println("customer add  called" + "\t" + customer.getFirstname());
		customerService.add(customer);
		return "Customer created successfully";
	}

	@RequestMapping(path = "/customer/verify", method = RequestMethod.POST)
	public String verify(@RequestBody customerLoginDto customerLoginDto) {

		boolean flag = customerService.verify(customerLoginDto);
		String flag1 = Boolean.toString(flag);
		System.out.println("customer is verified");
		return flag1;
	}

	@RequestMapping(path = "/customer/{id}", method = RequestMethod.GET)
	public Customer fetch(@PathVariable("id") int id) {
		System.out.println("the customer is gng to be deleted" + id);
		return customerService.fetch(id);

	}

}
