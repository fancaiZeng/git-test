package com.puhui.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO (用一句话来描述此类)
 *
 * @author: 曾凡财
 * @date: 2019-11-04
 **/
@RestController
@Slf4j
public class TestRest {
    @RequestMapping("/test")
    public String sayHello() {
        log.info("TestRest :started");
        return "hello";
    }
}
