package com.yyhdbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class VehicleReservationNavigationSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VehicleReservationNavigationSystemApplication.class, args);
    }

}
