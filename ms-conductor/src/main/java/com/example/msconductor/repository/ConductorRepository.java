package com.example.msconductor.repository;
import com.example.msconductor.entity.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ConductorRepository extends JpaRepository<Conductor, Integer> {
    List<Conductor> findByNombre(String nombre);
}