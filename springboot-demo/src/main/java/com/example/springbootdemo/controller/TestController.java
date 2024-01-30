package com.example.springbootdemo.controller;

import com.example.springbootdemo.config.ResponseMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello-word")
    public ResponseMsg<String> helloWorld(){
        return ResponseMsg.success("hello world");
    }

}
