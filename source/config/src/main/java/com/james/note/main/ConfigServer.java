package com.james.note.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Admin on 2017/8/7.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer {
    public static void main(String[] args){
        SpringApplication.run(ConfigServer.class,args);
    }
}
