package com.wangdian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
//@EnableEurekaServer
public class App 
{
    public static void main( String[] args )
    {

        SpringApplication.run(App.class,args);
    }
}
