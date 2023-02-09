package com.example.demo.Service.Impl;

import com.example.demo.DTO.Customer_DTO;
import com.example.demo.Entity.Customer;
import com.example.demo.Repo.CustomerRepo;
import com.example.demo.Service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// impl <---> service
//  <-- impl
//      -- to
//          -- controller
//              -->
//  service <-----> controller

@Service
@Transactional
public class CustomerService_Impl implements CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    @Autowired

    private ModelMapper modelMapper;

    @Override
    public Customer_DTO saveCustomer(Customer_DTO customerDto) {
        customerRepo.save(modelMapper.map(customerDto, Customer.class));
        customerRepo.findAll();
        return customerDto;
    }
}
