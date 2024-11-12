package com.example.mspassenger.repository;
import com.example.mspassenger.entity.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ReservationsRepository extends JpaRepository<Reservations, Integer> {
    List<Reservations> findByDescription(String description);
}

