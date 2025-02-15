package com.example.graphQL_playground.controller.lec02;

import com.example.graphQL_playground.controller.lec02.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @QueryMapping("customers")
    public List<CustomerEntity> getAllCustomers(){
       return customerService.getCustomers();
    }
}
