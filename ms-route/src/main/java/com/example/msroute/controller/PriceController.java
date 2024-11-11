package com.example.msroute.controller;
import com.example.msroute.entity.Price;
import com.example.msroute.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/price")
public class PriceController {
    @Autowired
    private PriceService priceService;

    @GetMapping
    public ResponseEntity<List<Price>> getAll() {
        return ResponseEntity.ok(priceService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Price>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(priceService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Price> create(@RequestBody Price price) {
        return ResponseEntity.ok(priceService.save(price));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Price> update(@PathVariable Integer id,
                                        @RequestBody Price price) {
        price.setId(id);
        return ResponseEntity.ok(priceService.save(price));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Price>> delete(@PathVariable Integer id) {
        priceService.delete(id);
        return ResponseEntity.ok(priceService.list());
    }
}


