package com.example.mspassenger.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-travel-service", path = "/travel")
public interface TravelFeign {
    @GetMapping("/{id}")
    public ResponseEntity<TravelFeign> listById(@PathVariable(required = true) Integer id);


}