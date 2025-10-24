package com.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignApplication {
    static public String name = "Aydın";

    public static void main(String[] args){
        SpringApplication.run(ObserverDesignApplication.class, args);
    }
}
