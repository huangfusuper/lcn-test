package com.order;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangfu
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
@MapperScan("com.order.mapper")
@EnableDistributedTransaction
public class ServerOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerOneApplication.class);
    }
}
