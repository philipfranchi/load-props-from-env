package com.philipfranchi.poc;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class AppConfig {

    @Bean
    public AppProperties appProperties() {
        return new AppProperties();
    }
}
