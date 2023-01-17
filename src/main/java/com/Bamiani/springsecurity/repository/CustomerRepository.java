package com.Bamiani.springsecurity.repository;
import org.springframework.data.repository.CrudRepository;

import com.Bamiani.springsecurity.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    List<Customer> findByEmail(String email);



}
