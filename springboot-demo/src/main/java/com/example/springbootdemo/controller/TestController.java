package com.example.springbootdemo.controller;

import com.example.springbootdemo.config.ResponseMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA
 *
 * @author zhwang40
 * @date：2024/1/29
 * @time：09:56
 * @descripion: 测试
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello-word")
    public ResponseMsg<String> helloWorld(){
        return ResponseMsg.success("hello world");
    }

}
