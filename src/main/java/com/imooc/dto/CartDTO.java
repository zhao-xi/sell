package com.imooc.dto;

import lombok.Data;

/*
* 购物车对象
* */
@Data
public class CartDTO {
    /* 商品ID */
    private String productId;

    /* 购买数量 */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
