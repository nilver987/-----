package com.example.mspassenger.service.impl;


import com.example.mspassenger.entity.Reservations;
import com.example.mspassenger.feign.TravelFeign;
import com.example.mspassenger.repository.ReservationsRepository;
import com.example.mspassenger.service.ReservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ReservationsServiceImpl implements ReservationsService {
    @Autowired
    private ReservationsRepository reservationsRepository;
    @Autowired
    private TravelFeign travelFeign;
    @Override
    public List<Reservations> list() {
        return reservationsRepository.findAll();
    }

    @Override
    public Optional<Reservations> findById(Integer id) {
        return reservationsRepository.findById(id);
    }

    @Override
    public Reservations save(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public Reservations update(Reservations reservations) {
        return reservationsRepository.save(reservations);
    }

    @Override
    public void delete(Integer id) {
        reservationsRepository.deleteById(id);
    }
}
