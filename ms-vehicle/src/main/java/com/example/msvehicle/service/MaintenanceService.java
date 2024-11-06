package com.example.msvehicle.service;


import com.example.msvehicle.entity.Maintenance;

import java.util.List;
import java.util.Optional;

public interface MaintenanceService {
    List<Maintenance> list();
    Optional<Maintenance> findById(Integer id);
    Maintenance save(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void delete(Integer id);
}