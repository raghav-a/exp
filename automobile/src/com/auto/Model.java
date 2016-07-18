package com.auto;

import java.util.List;

public class Model {

    private final List<Accessory> accessories;
    private final String id;

    public Model(List<Accessory> accessories, String id) {
        this.accessories = accessories;
        this.id = id;
    }

}
