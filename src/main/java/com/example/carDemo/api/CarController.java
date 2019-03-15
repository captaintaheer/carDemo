package com.example.carDemo.api;

import com.example.carDemo.model.Car;
import com.example.carDemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/car")
@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService){
        this.carService = carService;
    }

    @PostMapping
    public void  addCar (@RequestBody Car carName ,
                         @RequestBody Car carManufacturer){

        carService.addCar(carName,carManufacturer);
    }

    @GetMapping
    public List<Car> getAllCar(){
        return carService.getAllCar();
    }


}
