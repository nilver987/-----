package com.example.mspassenger.service;
import com.example.mspassenger.entity.Ticket;

import java.util.List;
import java.util.Optional;
public interface TicketService {
    List<Ticket> list();
    Optional<Ticket> findById(Integer id);
    Ticket save(Ticket ticket);
    Ticket update(Ticket ticket);
    void delete(Integer id);
}
