package com.klef.jfsd.exam;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
