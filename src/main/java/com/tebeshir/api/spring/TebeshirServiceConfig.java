package com.tebeshir.api.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yeko on 31/12/15.
 */
@Configuration
@ComponentScan({ "com.tebeshir.api" })
public class TebeshirServiceConfig {

    public TebeshirServiceConfig() {
        super();
    }

    // beans

}