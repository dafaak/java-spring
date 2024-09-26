package com.dafaak.spring.examples.a2;

import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessCalculationService {

    DataService dataService;

    public BusinessCalculationService(DataService dataService) {
        this.dataService = dataService;

    }

    public int findMax() {

        return Arrays.stream(dataService.retrieveDAta()).max().orElse(0);
    }
}
