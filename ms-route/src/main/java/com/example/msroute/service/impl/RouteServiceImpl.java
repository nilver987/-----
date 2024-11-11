package com.example.msroute.service.impl;


import com.example.mstravel.entity.Conductor;
import com.example.mstravel.entity.Travel;
import com.example.mstravel.repository.ConductorRepository;
import com.example.mstravel.repository.TravelRepository;
import com.example.mstravel.service.ConductorService;
import com.example.mstravel.service.TravelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements ConductorService {
    @Autowired
    private ConductorRepository conductorRepository;

    @Override
    public List<Conductor> list() {
        return conductorRepository.findAll();
    }

    @Override
    public Optional<Conductor> findById(Integer id) {
        return conductorRepository.findById(id);
    }

    @Override
    public Conductor save(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    @Override
    public Conductor update(Conductor conductor) {
        return conductorRepository.save(conductor);
    }

    @Override
    public void delete(Integer id) {
        conductorRepository.deleteById(id);
    }
}
