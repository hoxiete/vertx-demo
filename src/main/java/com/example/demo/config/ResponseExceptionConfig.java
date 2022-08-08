package com.example.demo.config;

import com.jd.laf.web.vertx.response.ErrorSupplier;
import com.jd.laf.web.vertx.response.Response;
import com.jd.laf.web.vertx.response.Responses;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ResponseExceptionConfig {

    @Bean
    public ErrorSupplier nullPointerException(){
       return new ErrorSupplier() {
            @Override
            public Response error(Throwable throwable) {
                return Responses.error(Response.HTTP_INTERNAL_ERROR, "服务异常");
            }

            @Override
            public Class<? extends Throwable> type() {
                return NullPointerException.class;
            }
        };
    }
}
