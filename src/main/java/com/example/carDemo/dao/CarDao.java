package com.example.carDemo.dao;

import com.example.carDemo.model.Car;

import java.util.List;
import java.util.UUID;

public interface CarDao {

    int insertCar(UUID id, Car carName, Car carManufacturer);
    default  int insertCar(Car carName, Car carManufacturer){
        UUID id = UUID.randomUUID();
        return insertCar(id, carName, carManufacturer);
    }

    List<Car> selectAllCar();
}
