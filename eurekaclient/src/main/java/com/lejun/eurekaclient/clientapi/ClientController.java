package com.lejun.eurekaclient.clientapi;


import com.lejun.eurekaclient.clientapi.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *  @author: lejun.li
 *  @Date: 2019/12/12 下午1:55
 *  @Description:
 */
@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private OrderInfoService orderInfoService;

    @GetMapping("/getUserInfo")
    public String getUserInfo(){
        return restTemplate.postForObject("http://server-provider/provider/queryUserInfoById",null,String.class);
    }

    @PostMapping("/getRoom")
    public String queryRoomInfo(String id){
        return restTemplate.getForObject("http://server-provider/provider/getRoomInfoById?id="+id,String.class);
    }

    @GetMapping("/getOrderInfo")
    public String getOrderInfoById(Integer id){
        return orderInfoService.getOrdInfoById(id);
    }
}
