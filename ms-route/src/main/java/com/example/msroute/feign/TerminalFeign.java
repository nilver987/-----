package com.example.msroute.feign;

import com.example.msroute.dto.TerminalDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-terminal-service", path = "/terminal")
public interface TerminalFeign {
    @GetMapping("/{id}")
    public ResponseEntity<TerminalDto> listById(@PathVariable(required = true) Integer id);
}
