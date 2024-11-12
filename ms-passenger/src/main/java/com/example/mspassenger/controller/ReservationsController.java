package com.example.mspassenger.controller;
import com.example.mspassenger.entity.Reservations;
import com.example.mspassenger.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/passenger")
public class ReservationsController {
    @Autowired
    private ReservationsService reservationsService;

    @GetMapping
    public ResponseEntity<List<Reservations>> getAll() {
        return ResponseEntity.ok(reservationsService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Reservations>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(reservationsService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Reservations> create(@RequestBody Reservations reservations) {
        return ResponseEntity.ok(reservationsService.save(reservations));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Reservations> update(@PathVariable Integer id,
                                            @RequestBody Reservations reservations) {
        reservations.setId(id);
        return ResponseEntity.ok(reservationsService.save(reservations));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Reservations>> delete(@PathVariable Integer id) {
        reservationsService.delete(id);
        return ResponseEntity.ok(reservationsService.list());
    }
}

