package com.imooc.service.impl;

import com.imooc.dataobject.OrderDetail;
import com.imooc.dataobject.OrderMaster;
import com.imooc.dto.OrderDTO;
import com.imooc.enums.OrderStatusEnum;
import com.imooc.enums.PayStatusEnum;
import com.imooc.service.OrderService;
import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest extends TestCase {

    @Autowired
    OrderService orderService;

    String BUYER_OPENID = "1100110";

    @Test
    public void testCreate() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerOpenid(BUYER_OPENID);
        orderDTO.setBuyerName("赵大柱");
        orderDTO.setBuyerAddress("庆应义塾大学");
        orderDTO.setBuyerPhone("18888888888");

        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("123456");
        o1.setProductQuantity(1);
        orderDetailList.add(o1);
        orderDTO.setOrderDetailList(orderDetailList);
        OrderDetail o2 = new OrderDetail();
        o2.setProductId("123457");
        o2.setProductQuantity(2);
        orderDetailList.add(o2);

        OrderDTO res = orderService.create(orderDTO);
        log.info("【创建订单】result={}", res);
        Assert.assertNotNull(res);
    }

    @Test
    public void testFindOne() {
        OrderDTO orderDTO = orderService.findOne("1601104959497683475");
        Assert.assertNotNull(orderDTO);
    }

    @Test
    public void testFindList() {
        Page<OrderDTO> orderDTOPage = orderService.findList("1100110", new PageRequest(0,2));
        Assert.assertNotEquals(0, orderDTOPage.getTotalElements());
    }

    @Test
    public void testCancel() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("1601104959497683475");
        OrderDTO res = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(), res.getOrderStatus());
    }

    @Test
    public void testFinish() {
        OrderDTO orderDTO = orderService.findOne("1601104748974602246");
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(), result.getOrderStatus());
    }

    @Test
    public void testPaid() {
        OrderDTO orderDTO = orderService.findOne("1601104748974602246");
        orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(), orderDTO.getPayStatus());
    }
}