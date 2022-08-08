package com.example.demo.config;

import com.jd.laf.web.vertx.RouteProvider;
import com.jd.laf.web.vertx.RoutingVerticle;
import com.jd.laf.web.vertx.config.RouterBuilder;
import com.jd.laf.web.vertx.spring.RoutingVerticleProvider;
import com.jd.laf.web.vertx.spring.SpringEnvironment;
import com.jd.laf.web.vertx.spring.VerticleMeta;
import com.jd.laf.web.vertx.spring.VerticleProvider;
import com.jd.laf.web.vertx.spring.boot.VertxWebProperties;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VertConfiguation {

    @Bean
    public VerticleProvider jobVerticle(
            org.springframework.core.env.Environment environment,
            ApplicationContext context,
            VertxWebProperties webProperties) {
        return new VerticleProvider() {
            @Override
            public VerticleMeta getVerticleMeta() {
                return null;
            }
        };
    }
}
