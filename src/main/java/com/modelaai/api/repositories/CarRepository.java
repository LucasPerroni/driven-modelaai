package com.modelaai.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.modelaai.api.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
