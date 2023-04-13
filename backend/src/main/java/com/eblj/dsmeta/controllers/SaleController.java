package com.eblj.dsmeta.controllers;

import com.eblj.dsmeta.entities.Sale;
import com.eblj.dsmeta.rest.SmsService;
import com.eblj.dsmeta.rest.services.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;

@RestController
@RequestMapping(value="/sales")
public class SaleController {

    @Autowired
    private SaleServiceImpl service;

    @Autowired
    private SmsService smsService;

    @GetMapping("{minDate}/{maxDate}")
    public Page<Sale> findSales(
            @PathVariable(value = "minDate") String minDate,
            @PathVariable(value = "maxDate") String maxDate,
            Pageable pageable){
       return service.findSalles(minDate,maxDate,pageable);
    }

    @GetMapping("{id}/notification")
    public void notifySms( @PathVariable Long id){
      smsService.sendSms(id);
    }
}
