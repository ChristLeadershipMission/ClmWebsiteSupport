package com.example.clmwebsitesupport.configurations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
@Getter
public class ConfigProperties {
    @Value("${clm.website.server.baseurl}")
    private String clmWebsiteServerBaseUrl;
    @Value("${deliChops.website.server.baseurl}")
    private String deliChopsWebsiteServerBaseUrl;
     @Value("${mart.website.server.baseurl}")
    private String martWebsiteServerBaseUrl;

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl(clmWebsiteServerBaseUrl)
                .build();
    }
}
