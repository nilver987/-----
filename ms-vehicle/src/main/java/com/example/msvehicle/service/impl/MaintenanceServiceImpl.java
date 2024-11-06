package com.example.msvehicle.service.impl;

import com.example.msvehicle.entity.Maintenance;
import com.example.msvehicle.repository.MaintenanceRepository;
import com.example.msvehicle.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MaintenanceServiceImpl implements MaintenanceService {
    @Autowired
    private MaintenanceRepository maintenanceRepository;

    @Override
    public List<Maintenance> list() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Optional<Maintenance> findById(Integer id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public Maintenance save(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void delete(Integer id) {
        maintenanceRepository.deleteById(id);
    }
}