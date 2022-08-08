package com.example.demo.config;

import com.example.demo.service.UserService;
import com.jd.laf.binding.annotation.Value;
import com.jd.laf.web.vertx.Blocking;
import com.jd.laf.web.vertx.Command;
import com.jd.laf.web.vertx.annotation.QueryParam;
import com.jd.laf.web.vertx.pool.Poolable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

@Component
@Slf4j
public class HelloWorldCommand implements Command, Poolable {

    @QueryParam("echo")
    String echo;
    @NotNull
    @Value
    UserService userService;

    @Value
    TaskRunner taskRunner;

    @Override
    public Result execute() throws Exception {
        log.info("adasd");
//        int i = 1/0;
        Integer i = null;
        i.byteValue();
        return new Result(echo == null ? "hello world!" : echo);
    }

    public Result helloTask(@QueryParam("echo") String echo) throws Exception {
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        return new Result(echo);
    }

    public Result helloTask1(@QueryParam("echo") String echo) throws Exception {
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        taskRunner.addMessage(echo);
        return new Result(echo);
    }

    @Override
    public void clean() {
        echo = null;
    }
}
