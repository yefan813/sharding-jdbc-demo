package com.yefan.study.service.impl;

import com.yefan.study.entity.Order;
import com.yefan.study.mapper.OrderMapper;
import com.yefan.study.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author yefan
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public void save(Order order) {
        orderMapper.insert(order);
    }

    @Override
    public Order findById(Long id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
