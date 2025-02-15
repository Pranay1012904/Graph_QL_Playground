package com.example.graphQL_playground.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphQLController {

    @QueryMapping
    public String sayHello(){
        return "Hello World!";
    }

    @QueryMapping("passArgs")
    public String acceptingArgs(@Argument int age){
        return String.valueOf(age)+" returned Int in String format";
    }
}
