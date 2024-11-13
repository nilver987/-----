package com.example.mspassenger.service;
import com.example.mspassenger.entity.Reservations;

import java.util.List;
import java.util.Optional;
public interface ReservationsService {
    List<Reservations> list();
    Optional<Reservations> findById(Integer id);
    Reservations save(Reservations reservations);
    Reservations update(Reservations reservations);
    void delete(Integer id);




}
