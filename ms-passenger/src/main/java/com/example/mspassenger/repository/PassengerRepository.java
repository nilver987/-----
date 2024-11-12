package com.example.mspassenger.repository;
import com.example.mspassenger.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface PassengerRepository extends JpaRepository<Passenger, Integer> {
    List<Passenger> findByDescription(String description);
}
