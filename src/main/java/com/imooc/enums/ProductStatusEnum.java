package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架")
    ;

    private Integer status;
    private String message;
    ProductStatusEnum(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
