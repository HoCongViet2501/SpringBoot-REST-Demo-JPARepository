package com.demo.SpringBootRestJpaRepository.Dao;

import com.demo.SpringBootRestJpaRepository.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
