package com.green.DataPractice.controller;

import com.green.DataPractice.vo.DeliveryVo;
import com.green.DataPractice.vo.OrderVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class OrderController {

    @GetMapping("/order1")
    public String order1(){
        return "order";
    }

    @PostMapping("/order2")
    public String order2(OrderVo orderVo){
        return "delivery";
    }

    @PostMapping("/order3")
    public String order3(OrderVo orderVo, DeliveryVo deliveryVo){
        return "order_info";
    }


}
