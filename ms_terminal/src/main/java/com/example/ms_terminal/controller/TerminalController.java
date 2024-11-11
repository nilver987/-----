package com.example.ms_terminal.controller;
import com.example.ms_terminal.entity.Terminal;
import com.example.ms_terminal.service.TerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/terminal")
public class TerminalController {
    @Autowired
    private TerminalService terminalService;

    @GetMapping
    public ResponseEntity<List<Terminal>> getAll() {
        return ResponseEntity.ok(terminalService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Terminal>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(terminalService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Terminal> create(@RequestBody Terminal terminal) {
        return ResponseEntity.ok(terminalService.save(terminal));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Terminal> update(@PathVariable Integer id,
                                           @RequestBody Terminal terminal) {
        terminal.setId(id);
        return ResponseEntity.ok(terminalService.save(terminal));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Terminal>> delete(@PathVariable Integer id) {
        terminalService.delete(id);
        return ResponseEntity.ok(terminalService.list());
    }

}
