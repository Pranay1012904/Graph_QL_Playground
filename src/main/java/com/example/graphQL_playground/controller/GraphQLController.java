package com.example.graphQL_playground.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Mono;

import java.util.concurrent.ThreadLocalRandom;

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

   /* @QueryMapping
    public int random(){
        retrun 10;//Mono.just(10);//ThreadLocalRandom.current().nextInt(1, 100));
    }*/
    @QueryMapping
    public Mono<Integer> random(){
        return Mono.just(ThreadLocalRandom.current().nextInt(1, 100));
    }
}
