package com.eblj.dsmeta.rest;

import com.eblj.dsmeta.entities.Sale;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SaleService {
    Page<Sale> findSalles(String minDate,String maxDate,Pageable pageable);
}
