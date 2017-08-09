package com.james.note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Created by Admin on 2017/8/8.
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    public static void main(String[] args){
        SpringApplication.run(EurekaApplication.class,args);
    }

}
