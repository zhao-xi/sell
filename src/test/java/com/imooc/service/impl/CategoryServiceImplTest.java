package com.imooc.service.impl;

import com.imooc.dataobject.ProductCategory;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest extends TestCase {
    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void testFindOne() {
        ProductCategory productCategory = categoryService.findOne(1);
        Assert.assertEquals(new Integer(1), productCategory.getCategoryId());
    }

    @Test
    public void testFindAll() {
        List<ProductCategory> productCategories = categoryService.findAll();
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void testFindByCategoryTypeIn() {
        List<ProductCategory> productCategories = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4,5));
        Assert.assertNotNull(productCategories);
    }

    @Test
    public void testSave() {
        ProductCategory productCategory = new ProductCategory("男生最爱", 10);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);
    }
}