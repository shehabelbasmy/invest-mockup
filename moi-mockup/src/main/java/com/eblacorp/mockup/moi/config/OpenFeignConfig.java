package com.eblacorp.mockup.moi.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.eblacorp.mockup.moi.integration.clients")
public class OpenFeignConfig {}
