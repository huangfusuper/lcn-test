package com.server2.controller;

import com.pojo.ServerTwo;
import com.server2.server.ServerTwoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangfu
 */
@RestController
public class ServerTwoController {

    @Autowired
    private ServerTwoService serverTwoService;

    @PostMapping("addData2")
    public void addData(@RequestBody ServerTwo serverTwo){
        serverTwoService.insertData(serverTwo);
    }
}
