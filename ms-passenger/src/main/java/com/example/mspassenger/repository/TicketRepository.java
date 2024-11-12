package com.example.mspassenger.repository;
import com.example.mspassenger.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
    List<Ticket> findByDescription(String description);
}