package com.example.msroute.service.impl;
import com.example.msroute.entity.Price;
import com.example.msroute.repository.PriceRepository;
import com.example.msroute.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceRepository priceRepository;

    @Override
    public List<Price> list() {
        return priceRepository.findAll();
    }

    @Override
    public Optional<Price> findById(Integer id) {
        return priceRepository.findById(id);
    }

    @Override
    public Price save(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public Price update(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public void delete(Integer id) {
        priceRepository.deleteById(id);
    }
}
