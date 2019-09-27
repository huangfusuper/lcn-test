package com.order.client;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.pojo.ServerTwo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author huangfu
 */
@FeignClient(value = "server2")
public interface ServerTwoClient {

    @RequestMapping(value = "/addData2",method = RequestMethod.POST)
    public void addData2(@RequestBody ServerTwo serverTwo);
}
