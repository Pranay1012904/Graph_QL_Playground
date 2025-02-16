package com.example.graphQL_playground.controller.lec03;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor(staticName = "create")
public class OrderEntity {
    UUID id;
    String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
