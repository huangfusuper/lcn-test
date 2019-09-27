package com.server2;

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
@MapperScan("com.server2.mapper")
@EnableDistributedTransaction
public class ServerTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerTwoApplication.class);
    }
}
