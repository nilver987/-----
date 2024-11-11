package com.example.msroute.repository;
import com.example.mstravel.entity.Conductor;
import com.example.mstravel.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Conductor, Integer> {

}
