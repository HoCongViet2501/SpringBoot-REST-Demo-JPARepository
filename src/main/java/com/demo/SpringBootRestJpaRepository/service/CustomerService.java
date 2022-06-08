package com.demo.SpringBootRestJpaRepository.service;


import com.demo.SpringBootRestJpaRepository.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getListCustomers();
}
