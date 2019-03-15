package com.example.carDemo.model;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Car {

    private final UUID id;
    private final String name;
    private final String manufacturer;

    public Car(@JsonProperty("id") UUID id,
               @JsonProperty("name") String name,
               @JsonProperty("manufacturer") String manufacturer)
    {

        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public UUID getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getManufacturer(){
        return manufacturer;
    }
}
