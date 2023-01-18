package com.modelaai.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelaai.api.DTO.CarDTO;
import com.modelaai.api.model.Car;
import com.modelaai.api.repositories.CarRepository;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository repository;

    @PostMapping
    public void createCar(@RequestBody CarDTO req) {
        repository.save(new Car(req));
    }

    @GetMapping
    public List<Car> getAllCars() {
        return repository.findAll();
    }

}
