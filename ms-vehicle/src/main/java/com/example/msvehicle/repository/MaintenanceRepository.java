package com.example.msvehicle.repository;

import com.example.msvehicle.entity.Maintenance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface MaintenanceRepository extends JpaRepository<Maintenance, Integer> {
    List<Maintenance> findByDescription(String description);
}
