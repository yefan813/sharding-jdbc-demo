package com.yefan.study.controller;

import com.yefan.study.entity.Order;
import com.yefan.study.service.OrderService;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("order")
public class OrderController {

    final SnowflakeShardingKeyGenerator keyGenerator = new SnowflakeShardingKeyGenerator();

    @Autowired
    private OrderService orderService;

    @PostMapping("save")
    public String save(@RequestBody Order order){
        String keyId = keyGenerator.generateKey().toString();
        long id = Long.valueOf(keyId);
        order.setId(id);
        orderService.save(order);
        return "success";
    }

    @GetMapping("findById")
    public Order findById(Long id){
        return orderService.findById(id);
    }

}