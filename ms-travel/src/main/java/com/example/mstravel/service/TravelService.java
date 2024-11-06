package com.example.mstravel.service;

import com.example.mstravel.entity.Travel;

import java.util.List;
import java.util.Optional;
public interface TravelService {
    List<Travel> list();
    Optional<Travel> findById(Integer id);
    Travel save(Travel travel);
    Travel update(Travel travel);
    void delete(Integer id);
}

