package com.lejun.eurekaserver.serverapi;

import org.springframework.web.bind.annotation.*;


/**
 *  @author: lejun.li
 *  @Date: 2019/12/12 下午1:35
 *  @Description:
 */

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @PostMapping("/queryUserInfoById")
    public String queryUserInfo(){
        return "用户名称是：李四";
    }

    @GetMapping("/getRoomInfoById")
    public String getRoomInfo(@RequestParam("id") String id){
        System.out.println("房间id是："+id);
        return "房间信息";
    }
    @RequestMapping("/getOrdInfoById")
    public String getOrdInfoById(Integer id){
        System.out.println("订单id是："+id);
        return "订单信息";
    }
}
