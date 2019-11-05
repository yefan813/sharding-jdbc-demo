package com.yefan.study.service;

import com.yefan.study.entity.Order;

/**
 * @author yefan
 */
public interface OrderService {
    void save(Order order);

    Order findById(Long id);
}
