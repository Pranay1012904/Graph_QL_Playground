package com.example.graphQL_playground.controller.lec03;

import com.example.graphQL_playground.controller.lec03.service.CustomerOrderService;
import com.example.graphQL_playground.controller.lec03.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerOrderService customerOrderService;

    @SchemaMapping(
            typeName = "Query"
    )
    public List<CustomerEntity> customers(){
       return customerService.getCustomers();
    }

    @SchemaMapping(
            typeName = "Customer"//use the schema object property name
    )
    public List<OrderEntity> order(CustomerEntity customerEntity, @Argument Integer limit){
        return customerOrderService.order(customerEntity.getName(), limit).subList(0,limit);
    }
}
