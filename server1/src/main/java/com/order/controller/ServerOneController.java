package com.order.controller;

import com.order.server.ServerOneService;
import com.pojo.ServerOne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author huangfu
 */
@RestController
public class ServerOneController {

    private final ServerOneService serverOneService;

    @Autowired
    public ServerOneController(ServerOneService serverOneService) {
        this.serverOneService = serverOneService;
    }


    @RequestMapping("addDataOne")
    public String addDataOne(String id){
        ServerOne serverOne = new ServerOne();
        serverOne.setId(UUID.randomUUID().toString());
        serverOne.setName("张三");
        serverOneService.insertData(serverOne,id);
        return "success";
    }
}
