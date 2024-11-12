package com.example.mspassenger.service.impl;

import com.example.mspassenger.entity.Passenger;
import com.example.mspassenger.repository.PassengerRepository;
import com.example.mspassenger.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PasengerServiceImpl implements PassengerService {
    @Autowired
    private PassengerRepository passengerRepository;

    @Override
    public List<Passenger> list() {
        return passengerRepository.findAll();
    }

    @Override
    public Optional<Passenger> findById(Integer id) {
        return passengerRepository.findById(id);
    }

    @Override
    public Passenger save(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public Passenger update(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    @Override
    public void delete(Integer id) {
        passengerRepository.deleteById(id);
    }
}