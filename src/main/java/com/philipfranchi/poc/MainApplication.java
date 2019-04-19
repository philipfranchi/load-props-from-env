package com.philipfranchi.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {
    private static Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

    @Autowired
    private AppProperties appProperties;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("Username: {}, Password: {}", appProperties.getUsername(), appProperties.getPassword());

    }
}