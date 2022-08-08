package com.example.demo.config;

import com.jd.laf.web.vertx.service.MessageDaemon;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskRunner extends MessageDaemon {

    public TaskRunner() {
        this.queueSizeKey = "tech.message.queue.size";
        this.pollTimeoutKey = "tech.message.poll.timeout";
        this.checkInterval = 5000;
    }

    @Override
    protected void onMessage(Object message) {
        System.out.println(message);
    }

    @Override
    protected void onCheck() {
        int size = this.events.size();
        System.out.println(size);
//        System.out.println(LocalDateTime.now());
    }

}
