package com.order.client.impl;

import com.order.client.ServerTwoClient;
import com.pojo.ServerTwo;
import org.springframework.stereotype.Component;

/**
 * @author huangfu
 */
@Component
public class ServerTwoClientImpl implements ServerTwoClient {
    @Override
    public void addData2(ServerTwo serverTwo) {
        System.out.println("------断路器-------------");
    }
}
