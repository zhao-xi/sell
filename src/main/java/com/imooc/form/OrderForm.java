package com.imooc.form;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class OrderForm {
    // 买家姓名
    @NotEmpty(message = "买家姓名不能为空")
    private String name;

    // 买家电话
    @NotEmpty(message = "买家电话不能为空")
    private String phone;

    // 买家地址
    @NotEmpty(message = "买家地址不能为空")
    private String address;

    // 买家openid
    @NotEmpty(message = "买家openid不能为空")
    private String openid;

    // 购物车
    @NotEmpty(message = "购物车不能为空")
    private String items;
}
