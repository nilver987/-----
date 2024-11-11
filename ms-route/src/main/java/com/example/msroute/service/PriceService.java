package com.example.msroute.service;

import com.example.msroute.entity.Price;

import java.util.List;
import java.util.Optional;

public interface PriceService {
    List<Price> list();
    Optional<Price> findById(Integer id);
    Price save(Price price);
    Price update(Price price);
    void delete(Integer id);

}
