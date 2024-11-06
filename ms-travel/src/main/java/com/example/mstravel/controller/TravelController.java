package com.example.mstravel.controller;


import com.example.mstravel.entity.Travel;
import com.example.mstravel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/travel")
public class TravelController {
    @Autowired
    private TravelService travelService;

    @GetMapping
    public ResponseEntity<List<Travel>> getAll() {
        return ResponseEntity.ok(travelService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Travel>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(travelService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Travel> create(@RequestBody Travel travel) {
        return ResponseEntity.ok(travelService.save(travel));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Travel> update(@PathVariable Integer id,
                                          @RequestBody Travel travel) {
        travel.setId(id);
        return ResponseEntity.ok(travelService.save(travel));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Travel>> delete(@PathVariable Integer id) {
        travelService.delete(id);
        return ResponseEntity.ok(travelService.list());
    }
}
