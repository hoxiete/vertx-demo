package com.example.demo.config;

import com.jd.laf.web.vertx.MessageHandler;
import io.vertx.core.eventbus.Message;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer implements MessageHandler<String> {
    @Override
    public String type() {
        return "message";
    }

    @Override
    public void handle(Message<String> event) {

    }
}
