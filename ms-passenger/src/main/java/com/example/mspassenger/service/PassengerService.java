package com.example.mspassenger.service;
import com.example.mspassenger.entity.Passenger;
import java.util.List;
import java.util.Optional;
public interface PassengerService {
    List<Passenger> list();
    Optional<Passenger> findById(Integer id);
    Passenger save(Passenger passenger);
    Passenger update(Passenger passenger);
    void delete(Integer id);
}
