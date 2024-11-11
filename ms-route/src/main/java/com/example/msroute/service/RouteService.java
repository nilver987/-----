package com.example.msroute.service;
import com.example.msroute.entity.Route;

import java.util.List;
import java.util.Optional;
public interface RouteService {List<Route> list();
    Optional<Route> findById(Integer id);
    Route save(Route route);
    Route update(Route route);
    void delete(Integer id);
}
