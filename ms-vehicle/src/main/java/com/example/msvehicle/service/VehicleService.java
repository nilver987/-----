package com.example.msvehicle.service;


import com.example.msvehicle.entity.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {
    List<Vehicle> list();
    Optional<Vehicle> findById(Integer id);
    Vehicle save(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    void delete(Integer id);
}
