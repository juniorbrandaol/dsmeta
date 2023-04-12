package com.eblj.dsmeta.controllers;

import com.eblj.dsmeta.entities.Sale;
import com.eblj.dsmeta.rest.SaleService;
import com.eblj.dsmeta.rest.services.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/sales")
public class SaleController {

    @Autowired
    private SaleServiceImpl service;
    @GetMapping
    public List<Sale> findSales(){
       return service.findSalles();
    }
}
