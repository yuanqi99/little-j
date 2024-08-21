package com.little.controller;

import com.little.service.BusinessService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-21
 * @Description:
 * @Version: 1.0
 */

@RestController
@RequestMapping
@AllArgsConstructor
public class BusinessController
{

    private final BusinessService businessService;


    @GetMapping("/bus")
    public String get(){
        businessService.purchase("123", "23", 12);

        return "ok";
    }
}
