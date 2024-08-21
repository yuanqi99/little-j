package com.little;

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
public class StorageApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(StorageApplication.class);
        System.out.println( "Hello World!" );
    }
}
