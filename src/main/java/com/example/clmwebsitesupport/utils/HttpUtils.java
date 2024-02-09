package com.example.clmwebsitesupport.utils;

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

    public String wakeServerUp(){
        return webClient
                .method(HttpMethod.GET)
                .uri("/clmWebsite/api/v1/admin/log")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
