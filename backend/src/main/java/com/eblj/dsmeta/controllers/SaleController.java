package com.eblj.dsmeta.controllers;

import com.eblj.dsmeta.entities.Sale;
import com.eblj.dsmeta.rest.SmsService;
import com.eblj.dsmeta.rest.services.impl.SaleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable;
import org.springframework.web.client.HttpClientErrorException;

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
            Pageable pageable)  {
        if(!minDate.isEmpty()){
            System.out.println("=================not empity ================");
            return service.findSalles(minDate, maxDate, pageable);
        }else{
            System.out.println("=================empity ================");
        }
return  null;
    }

    @GetMapping("{id}/notification")
    public void notifySms( @PathVariable Long id){
      smsService.sendSms(id);
    }
}
