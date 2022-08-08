package com.example.demo.config;

import com.jd.laf.web.vertx.ExceptionHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ServerExceptionHandler implements ExceptionHandler {

    @Override
    public Object type() {
        return "ServerExceptionHandler";
    }

    @Override
    public void handle(Throwable throwable) {
        log.info(throwable.getMessage());
    }
}