package com.imooc.repository;

import com.imooc.dataobject.OrderMaster;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest extends TestCase {
    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123457");
        orderMaster.setBuyerOpenid("abc246");
        orderMaster.setBuyerName("李四");
        orderMaster.setBuyerAddress("庆应义塾大学保定分校");
        orderMaster.setBuyerPhone("13911111020");
        orderMaster.setOrderAmount(new BigDecimal(5));

        repository.save(orderMaster);
    }

    @Test
    public void testFindByBuyerOpenid() {
        PageRequest page = new PageRequest(0,2);
        Page<OrderMaster> result = repository.findByBuyerOpenid("abc246", page);
        Assert.assertNotNull(result.getTotalElements());
    }
}