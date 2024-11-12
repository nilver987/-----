package com.example.mspassenger.controller;
import com.example.mspassenger.entity.Passenger;
import com.example.mspassenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
    @Autowired
    private PassengerService passengerService;

    @GetMapping
    public ResponseEntity<List<Passenger>> getAll() {
        return ResponseEntity.ok(passengerService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Passenger>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(passengerService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Passenger> create(@RequestBody Passenger passenger) {
        return ResponseEntity.ok(passengerService.save(passenger));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Passenger> update(@PathVariable Integer id,
                                              @RequestBody Passenger passenger) {
        passenger.setId(id);
        return ResponseEntity.ok(passengerService.save(passenger));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Passenger>> delete(@PathVariable Integer id) {
        passengerService.delete(id);
        return ResponseEntity.ok(passengerService.list());
    }
}
