package com.demo.SpringBootRestJpaRepository.controller;

import com.demo.SpringBootRestJpaRepository.entity.Customer;
import com.demo.SpringBootRestJpaRepository.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getListCustomers();
    }
}
