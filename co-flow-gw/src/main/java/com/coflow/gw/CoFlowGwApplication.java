package com.coflow.gw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class CoFlowGwApplication {

    public static void main(String[] args) {
        log.info("Starting CoFlow GW...");
        SpringApplication.run(CoFlowGwApplication.class, args);
        log.info("CoFlow GW started!");
    }

}
