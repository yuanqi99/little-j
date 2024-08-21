package com.little.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-18
 * @Description:
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController
{
    @GetMapping
    public String get(){
        return "ok";
    }
}
