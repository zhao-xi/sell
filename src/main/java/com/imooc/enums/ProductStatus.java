package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ProductStatus {
    UP(0, "上架"),
    DOWN(1, "下架")
    ;

    private Integer status;
    private String message;
    ProductStatus(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
