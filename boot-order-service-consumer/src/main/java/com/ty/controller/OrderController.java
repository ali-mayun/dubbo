package com.ty.controller;

import com.ty.bean.UserAddress;
import com.ty.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(@RequestParam("uid") String uid) {
        return orderService.initOrder(uid);
    }
}
