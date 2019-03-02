package com.jarvis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Hello world!
 * @author jie
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableFeignClients  //feign用于调用不同的服务
@EnableScheduling
public class TerminalApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(TerminalApplication.class);
    }
}
