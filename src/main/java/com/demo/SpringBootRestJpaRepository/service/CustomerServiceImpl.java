package com.demo.SpringBootRestJpaRepository.service;

import com.demo.SpringBootRestJpaRepository.Dao.CustomerRepository;
import com.demo.SpringBootRestJpaRepository.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public List<Customer> getListCustomers() {
        return customerRepository.findAll();
    }
}
