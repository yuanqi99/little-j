package com.little;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: 山居
 * @CreateTime: 2024-08-15
 * @Description:
 * @Version: 1.0
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SystemApplication.class);
    }
}
