package com.order.server.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.order.client.ServerTwoClient;
import com.order.mapper.ServerOneMapper;
import com.order.server.ServerOneService;
import com.pojo.ServerOne;
import com.pojo.ServerTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author huangfu
 */
@Service
@SuppressWarnings("all")
public class ServerOneServiceImpl implements ServerOneService {
    @Autowired
    private ServerOneMapper serverOneMapper;
    @Autowired
    private ServerTwoClient serverTwoClient;

    @Override
    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public void insertData(ServerOne serverOne,String id) {
        serverOneMapper.insertData(serverOne);
        ServerTwo serverTwo = new ServerTwo(serverOne.getId(),serverOne.getName());
        serverTwoClient.addData2(serverTwo);
        if("1".equals(id)){
            throw new RuntimeException("自定义异常");
        }
        System.out.println("---------------服务一执行完成---------------");
    }
}
