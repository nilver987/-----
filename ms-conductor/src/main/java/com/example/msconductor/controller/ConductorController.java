package com.example.msconductor.controller;

import com.example.msconductor.entity.Conductor;
import com.example.msconductor.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/conductor")
public class ConductorController {
    @Autowired
    private ConductorService conductorService;

    @GetMapping
    public ResponseEntity<List<Conductor>> getAll() {
        return ResponseEntity.ok(conductorService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Conductor>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(conductorService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Conductor> create(@RequestBody Conductor conductor) {
        return ResponseEntity.ok(conductorService.save(conductor));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Conductor> update(@PathVariable Integer id,
                                           @RequestBody Conductor conductor) {
        conductor.setId(id);
        return ResponseEntity.ok(conductorService.save(conductor));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Conductor>> delete(@PathVariable Integer id) {
        conductorService.delete(id);
        return ResponseEntity.ok(conductorService.list());
    }


}
