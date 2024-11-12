package com.example.msconductor.service;
import com.example.msconductor.entity.Conductor;

import java.util.List;
import java.util.Optional;

public interface ConductorService {
    List<Conductor> list();
    Optional<Conductor> findById(Integer id);
    Conductor save(Conductor conductor);
    Conductor update(Conductor conductor);
    void delete(Integer id);
}
