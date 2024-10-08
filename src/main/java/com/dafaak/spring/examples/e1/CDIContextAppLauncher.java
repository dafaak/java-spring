package com.dafaak.spring.examples.e1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class BusinessService {
    private DataService dataService;


    public DataService getDataService() {

        return dataService;
    }

    @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Data Service Dependency injected");
        this.dataService = dataService;
    }
}

@Component
class DataService {
}


@Configuration
@ComponentScan("com.dafaak.spring.examples.e1")
public class CDIContextAppLauncher {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(CDIContextAppLauncher.class)) {
            System.out.println(context.getBean(BusinessService.class).getDataService());
        }

    }

}
