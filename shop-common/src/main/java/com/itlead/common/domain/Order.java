package com.itlead.common.domain;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private String code;
    private Double totalMoney;
    private Integer totalNum;
    private Integer userId;
    private Integer productId;
    private Product product;
}
