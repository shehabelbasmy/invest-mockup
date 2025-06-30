package com.eblacorp.invest.mockup.moi.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.eblacorp.invest.mockup.moi.integration.clients")
public class OpenFeignConfig {}
