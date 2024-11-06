package com.example.mstravel.repository;

import com.example.msvehicle.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface TravelRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findByPlate(String plate);
}