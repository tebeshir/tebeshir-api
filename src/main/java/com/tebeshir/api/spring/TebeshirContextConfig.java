package com.tebeshir.api.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by yeko on 31/12/15.
 */
@Configuration
@ComponentScan({ "com.tebeshir.api" })
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class TebeshirContextConfig {

    public TebeshirContextConfig() {
        super();
    }

    // beans

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        final PropertySourcesPlaceholderConfigurer pspc = new PropertySourcesPlaceholderConfigurer();
        return pspc;
    }

}