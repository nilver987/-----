package com.example.msvehicle.controller;

import com.example.msvehicle.entity.Vehicle;
import com.example.msvehicle.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAll() {
        return ResponseEntity.ok(vehicleService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Vehicle>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(vehicleService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Vehicle> create(@RequestBody Vehicle vehicle) {
        return ResponseEntity.ok(vehicleService.save(vehicle));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Vehicle> update(@PathVariable Integer id,
                                           @RequestBody Vehicle vehicle) {
        vehicle.setId(id);
        return ResponseEntity.ok(vehicleService.save(vehicle));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Vehicle>> delete(@PathVariable Integer id) {
        vehicleService.delete(id);
        return ResponseEntity.ok(vehicleService.list());
    }
}

