package com.example.msventa.service.impl;


import com.example.msventa.entity.Sale;
import com.example.msventa.entity.SaleDetail;
import com.example.msventa.feign.ClientFeign;
import com.example.msventa.feign.ProductFeign;
import com.example.msventa.repository.SaleRepository;
import com.example.msventa.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImpl implements SaleService{
    @Autowired
    private SaleRepository saleRepository;

    @Autowired
    private ProductFeign productFeign;
    @Autowired
    private ClientFeign clientFeign;

    @Override
    public List<Sale> list() {
        return saleRepository.findAll();
    }

    @Override
    public Optional<Sale> findById(Integer id) {

        Optional<Sale> sale = saleRepository.findById(id);
        for (SaleDetail saleDetail : sale.get().getSaleDetails()) {
            saleDetail.setProductDto(productFeign.getById(saleDetail.getProductId()).getBody());
        }
        return saleRepository.findById(id);
    }

    @Override
    public Sale save(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public Sale update(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public void delete(Integer id) {
        saleRepository.deleteById(id);
    }
}