package com.example.sleuthdemo;

import datadog.trace.api.Trace;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SleuthController {

    @RequestMapping("/hello")
    @Trace
    public String hello() {
        log.info("Received hello-request");
        return "Hello!";
    }
}
