package com.movie.starwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

import com.movie.starwars.service.impl.StarwarsServiceImpl;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableFeignClients
@EnableDiscoveryClient
public class StarwarsApplication 
{
	
	public static void main(String[] args) {
        SpringApplication.run(StarwarsApplication.class, args);
    }
	

}
