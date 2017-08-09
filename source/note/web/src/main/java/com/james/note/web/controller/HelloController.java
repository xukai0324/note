package com.james.note.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Admin on 2017/8/9.
 */
@RestController
public class HelloController {
    //@Value("${spring}")
    String name;

    @Value("foo:jack")
    String value;

    @RequestMapping(value = "hello")
    public String sayHello() {
        return "hello : " + name + "-------" + value;
    }
}
