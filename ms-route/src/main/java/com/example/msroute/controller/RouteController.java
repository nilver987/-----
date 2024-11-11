package com.example.msroute.controller;
import com.example.msroute.entity.Route;
import com.example.msroute.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/route")
public class RouteController {
    @Autowired
    private RouteService routeService;

    @GetMapping
    public ResponseEntity<List<Route>> getAll() {
        return ResponseEntity.ok(routeService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Route>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(routeService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Route> create(@RequestBody Route route) {
        return ResponseEntity.ok(routeService.save(route));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Route> update(@PathVariable Integer id,
                                            @RequestBody Route route) {
        route.setId(id);
        return ResponseEntity.ok(routeService.save(route));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Route>> delete(@PathVariable Integer id) {
        routeService.delete(id);
        return ResponseEntity.ok(routeService.list());
    }
}
