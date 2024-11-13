package com.example.mspassenger.feign;

import com.example.mspassenger.dto.TravelDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-travel-service", path = "/travel")
public interface TravelFeign {

    // Cambié el tipo de retorno de ResponseEntity<TravelFeign> a ResponseEntity<TravelDto>
    @GetMapping("/{id}")
    public ResponseEntity<TravelDto> listById(@PathVariable("id") Integer id);

}
