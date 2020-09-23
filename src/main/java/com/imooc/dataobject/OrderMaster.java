package com.imooc.dataobject;

import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class OrderMaster {
    @Id
    private String orderId;

    /* 买家名字 */
    private String buyerName;

    /* 买家电话 */
    private String buyerPhone;

    /* 买家地址 */
    private String buyerAddress;

    /* 买家openid */
    private String buyerOpenid;

    /* 下单数量 */
    private BigDecimal orderAmount;

    /* 订单状态,默认0新下单 */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /* 支付状态,默认0未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /* 创建时间 */
    private Date createTime;

    /* 更新时间 */
    private Date updateTime;

}
