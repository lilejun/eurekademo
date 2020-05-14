package com.lejun.eurekaclient.clientapi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="server-provider")
public interface OrderInfoService {

    @RequestMapping(value = "/provider/getOrdInfoById",method = RequestMethod.GET)
    String getOrdInfoById(@RequestParam("id") Integer id);
}
