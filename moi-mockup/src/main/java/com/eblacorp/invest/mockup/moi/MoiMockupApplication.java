package com.eblacorp.invest.mockup.moi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MoiMockupApplication extends SpringBootServletInitializer 
//implements WebApplicationInitializer 
{

	public static void main(String[] args) {
		SpringApplication.run(MoiMockupApplication.class, args);
	}
	
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(MoiMockupApplication.class);
//	}
}
