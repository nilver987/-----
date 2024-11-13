package com.example.msroute.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msroute.entity.Route;
import com.example.msroute.feign.TerminalFeign;
import com.example.msroute.repository.RouteRepository;
import com.example.msroute.service.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;


    @Override
    public List<Route> list() {
        return routeRepository.findAll();
    }

    @Override
    public Optional<Route> findById(Integer id) {
        return routeRepository.findById(id);
    }

    @Override
    public Route save(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public Route update(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public void delete(Integer id) {
        routeRepository.deleteById(id);
    }
}
