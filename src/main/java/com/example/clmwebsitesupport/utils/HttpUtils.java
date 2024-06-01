package com.example.clmwebsitesupport.utils;

import com.example.clmwebsitesupport.configurations.ConfigProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
@RequiredArgsConstructor
public class HttpUtils {

    private final WebClient webClient;
    private final ObjectMapper objectMapper;
    private final ConfigProperties configProperties;

    public String wakeServerUp(){
        return webClient
                .method(HttpMethod.GET)
                .uri("/clmWebsite/api/v1/admin/log")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }

    public String wakeDeliChopsServerUp(){
        return WebClient.builder()
                .baseUrl(configProperties.getDeliChopsWebsiteServerBaseUrl())
                .build()
                .method(HttpMethod.GET)
                .uri("/api/v1/health-check")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
