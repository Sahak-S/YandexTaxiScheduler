package com.exampletaxi.yandextaxischeduler.controller;

import com.exampletaxi.yandextaxischeduler.model.MomentPrice;
import com.exampletaxi.yandextaxischeduler.service.TaxiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PriceController {
    private final TaxiService taxiService;
    @GetMapping("/prices")
    public List<MomentPrice> getAllPrices() {
        return taxiService.getAllPrices();
    }
}
