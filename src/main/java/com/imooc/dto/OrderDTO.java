package com.imooc.dto;

import com.imooc.dataobject.OrderDetail;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    private String orderId;

    /* 买家名字 */
    private String buyerName;

    /* 买家电话 */
    private String buyerPhone;

    /* 买家地址 */
    private String buyerAddress;

    /* 买家openid */
    private String buyerOpenid;

    /* 订单总价 */
    private BigDecimal orderAmount;

    /* 订单状态,默认0新下单 */
    private Integer orderStatus;

    /* 支付状态,默认0未支付 */
    private Integer payStatus;

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;

    /* 包含的OrderDetail表格 */
    List<OrderDetail> orderDetailList;
}
