package com.example.mstravel.repository;

import com.example.mstravel.entity.Travel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface TravelRepository extends JpaRepository<Travel, Integer> {

}