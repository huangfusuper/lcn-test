package com.server2.server.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.pojo.ServerOne;
import com.pojo.ServerTwo;
import com.server2.mapper.ServerTwoMapper;
import com.server2.server.ServerTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author huangfu
 */
@Service
@SuppressWarnings("all")
public class ServerTwoServiceImpl implements ServerTwoService {
    @Autowired
    private ServerTwoMapper serverTwoMapper;

    @Override
    @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public void insertData(ServerTwo serverTwo) {
        serverTwoMapper.insertData(serverTwo);
        System.out.println("---------------服务二执行完成---------------");
    }

}
