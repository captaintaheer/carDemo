package com.example.carDemo.dao;

import com.example.carDemo.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("MockDao")
public class MockCarDataAccessService implements CarDao {

    private static List<Car> DB = new ArrayList<>();

    @Override
    public int insertCar(UUID id, Car carName, Car carManufacturer) {
        DB.add(new Car(id, carName.getName(),carManufacturer.getManufacturer()));
        return 1;
    }

    @Override
    public List<Car> selectAllCar() {
        return DB;
    }
}
