package com.example.graphQL_playground.controller.lec02.service;

import com.example.graphQL_playground.controller.lec02.CustomerEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    public List<CustomerEntity> getCustomers(){
        CustomerEntity customer1=new CustomerEntity(1,"pran",34,"Ranchi");
        CustomerEntity customer2=new CustomerEntity(2,"divya",44,"Pune");
        CustomerEntity customer3=new CustomerEntity(3,"pranay",55,"Mumbai");
        CustomerEntity customer4=new CustomerEntity(4,"pranay_Ranjan",23,"Koderma");
        CustomerEntity customer5=new CustomerEntity(5,"ronny_pranay",21,"Thane");
        CustomerEntity customer6=new CustomerEntity(4,"sammy",33,"Koderma");
        CustomerEntity customer7=new CustomerEntity(5,"rohan",18,"Thane");
        List<CustomerEntity> customerEntityList= Arrays.asList(customer1,customer2,customer3,customer4,customer5);
        return customerEntityList;
    }

    public  List<CustomerEntity> getCustomerById(Integer id){
       List<CustomerEntity> fetchedCustomer= getCustomers().stream().filter(c->c.getId()==id).toList();
        return fetchedCustomer;
    }

    public  List<CustomerEntity> getCustomerByName(String name){
        List<CustomerEntity> fetchedCustomers= getCustomers().stream().filter(c-> c.getName().contains(name)).toList();
        return fetchedCustomers;
    }

    public List<CustomerEntity> findCustomerByAgeRange(Integer minAge, Integer maxAge){
     return   getCustomers().stream().filter(c-> (c.getAge()>=minAge && c.getAge()<=maxAge)).toList();
    }
}
