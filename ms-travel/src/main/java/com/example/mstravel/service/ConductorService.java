package com.example.mstravel.service;

import com.example.mstravel.entity.Conductor;
import com.example.mstravel.entity.Travel;

import java.util.List;
import java.util.Optional;
public interface ConductorService {

    List<Conductor> list();
    Optional<Conductor> findById(Integer id);
    Conductor save(Conductor conductor);
    Conductor update(Conductor conductor);
    void delete(Integer id);
}

