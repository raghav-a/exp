package com.auto;

import java.util.List;

public class Vehicle {

    List<Part> parts;
    private Model model;
    String id;

    public Vehicle(String id, List<Part> parts, Model model) {
        this.id = id;
        this.parts = parts;
        this.model = model;
    }

    public Double cost() {
        Double cost = 0.0;
        for (Part part : parts) {
             cost = cost + part.cost().getIn(Currency.inr)*part.quantityUsed();
        }
        return 0.0;
    }


}
