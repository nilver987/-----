package com.example.mstravel.repository;

import com.example.mstravel.entity.Conductor;
import com.example.mstravel.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConductorRepository extends JpaRepository<Conductor, Integer> {

}