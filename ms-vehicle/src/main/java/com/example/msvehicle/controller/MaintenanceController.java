package com.example.msvehicle.controller;


import com.example.msvehicle.entity.Maintenance;
import com.example.msvehicle.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {
    @Autowired
    private MaintenanceService maintenanceService;

    @GetMapping
    public ResponseEntity<List<Maintenance>> getAll() {
        return ResponseEntity.ok(maintenanceService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Maintenance>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(maintenanceService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Maintenance> create(@RequestBody Maintenance maintenance) {
        return ResponseEntity.ok(maintenanceService.save(maintenance));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Maintenance> update(@PathVariable Integer id,
                                          @RequestBody Maintenance maintenance) {
        maintenance.setId(id);
        return ResponseEntity.ok(maintenanceService.save(maintenance));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Maintenance>> delete(@PathVariable Integer id) {
        maintenanceService.delete(id);
        return ResponseEntity.ok(maintenanceService.list());
    }
}
