package com.eblj.dsmeta.rest.services.impl;

import com.eblj.dsmeta.entities.Sale;
import com.eblj.dsmeta.repositores.SaleRepository;
import com.eblj.dsmeta.rest.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepository repository;
    @Override
    public List<Sale> findSalles() {
        return repository.findAll();
    }
}
