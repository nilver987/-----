package com.example.msconductor.service.impl;
import com.example.msconductor.entity.Conductor;
import com.example.msconductor.repository.ConductorRepository;
import com.example.msconductor.service.ConductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConductorServiceImpl implements ConductorService {
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