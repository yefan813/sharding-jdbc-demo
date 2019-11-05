package com.yefan.study.entity;

import lombok.Data;

@Data
public class Order {
    private Long id;

    private Long orderId;

    private Integer userId;

    private String username;
}