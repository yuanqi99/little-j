package com.little;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.little")
@EnableDiscoveryClient
public class AccountApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(AccountApplication.class);
        System.out.println( "Hello World!" );
    }
}
