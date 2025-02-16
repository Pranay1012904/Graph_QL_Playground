package com.example.graphQL_playground.controller.lec03.service;

import com.example.graphQL_playground.controller.lec03.OrderEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerOrderService {
    private Map<String, List<OrderEntity>> dataMap = Map.of(
            "pran", List.of(
                    OrderEntity.create(UUID.randomUUID(), "prodict_1"),
                    OrderEntity.create(UUID.randomUUID(), "prodict_2"),
                    OrderEntity.create(UUID.randomUUID(), "prodict_3")
            ),
            "divya", List.of(
                    OrderEntity.create(UUID.randomUUID(), "prodict_4"),
                    OrderEntity.create(UUID.randomUUID(), "prodict_5"),
                    OrderEntity.create(UUID.randomUUID(), "prodict_6")
            )
    );

    //todo, make it more effective
    public List<OrderEntity> order(String name) {
        List<String> val=new ArrayList<>();

       if(dataMap.containsKey(name)){
          return dataMap.get(name);
       }
        return List.of(
                OrderEntity.create(UUID.randomUUID(), "NO ORDERS")
        );
    }
}