package com.example.carDemo.service;

import com.example.carDemo.dao.CarDao;
import com.example.carDemo.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarDao carDao;

    @Autowired
    public CarService(@Qualifier("MockDao") CarDao carDao){
        this.carDao= carDao;
    }

    public int addCar(Car carName, Car carManufacturer){
        return carDao.insertCar(carName,carManufacturer);
    }

    public List<Car>getAllCar(){
        return carDao.selectAllCar();
    }
}
