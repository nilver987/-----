package com.example.mstravel.service.impl;


import com.example.mstravel.entity.Travel;
import com.example.mstravel.repository.TravelRepository;
import com.example.mstravel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TravelServiceImpl implements TravelService {
    @Autowired
    private TravelRepository travelRepository;

    @Override
    public List<Travel> list() {
        return travelRepository.findAll();
    }

    @Override
    public Optional<Travel> findById(Integer id) {
        return travelRepository.findById(id);
    }

    @Override
    public Travel save(Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public Travel update(Travel travel) {
        return travelRepository.save(travel);
    }

    @Override
    public void delete(Integer id) {
        travelRepository.deleteById(id);
    }
}
