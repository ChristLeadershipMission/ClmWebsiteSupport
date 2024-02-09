package com.example.clmwebsitesupport.services;

import com.example.clmwebsitesupport.utils.HttpUtils;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
@Slf4j
public class HttpServiceImpl implements HttpService{
    private final HttpUtils httpUtils;

    @Scheduled(cron = "0 */10 * * * *")
    public void keepServiceAwake(){
        log.info("Waking Server...");
        log.info(LocalDateTime.now()+"::>> "+httpUtils.wakeServerUp());
    }
}
