package com.example.calculajuros.controllers;

import com.example.calculajuros.domain.CalculationResult;
import com.example.calculajuros.domain.Parameter;
import com.example.calculajuros.services.CalculateInterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/calcular")
public class CalculateInterestController {

    @Autowired
    private CalculateInterestService service;

    @GetMapping
    public ResponseEntity<CalculationResult> calculate(@RequestBody Parameter parameter) {
        return ResponseEntity.ok().body(service.calculate(parameter));
    }

}
