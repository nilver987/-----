package com.example.mspassenger.controller;
import com.example.mspassenger.entity.Ticket;
import com.example.mspassenger.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public ResponseEntity<List<Ticket>> getAll() {
        return ResponseEntity.ok(ticketService.list());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Ticket>> getById(@PathVariable Integer id) {
        return ResponseEntity.ok(ticketService.findById(id));
    }
    @PostMapping
    public ResponseEntity<Ticket> create(@RequestBody Ticket ticket) {
        return ResponseEntity.ok(ticketService.save(ticket));
    }
    @PutMapping("/{id}")
    public ResponseEntity<Ticket> update(@PathVariable Integer id,
                                               @RequestBody Ticket ticket) {
        ticket.setId(id);
        return ResponseEntity.ok(ticketService.save(ticket));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Ticket>> delete(@PathVariable Integer id) {
        ticketService.delete(id);
        return ResponseEntity.ok(ticketService.list());
    }

}
