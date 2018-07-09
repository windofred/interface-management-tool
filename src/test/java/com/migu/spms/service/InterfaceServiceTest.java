package com.migu.spms.service;

import com.migu.spms.entity.InterfaceDO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class InterfaceServiceTest {

    @Autowired
    private InterfaceService interfaceService;

    /**
     * 获取所有接口信息
     */
    @Test
    public void testGetAll() {
        List<InterfaceDO> list = interfaceService.getAll();
        Assert.assertNotNull(list);

        for (InterfaceDO interfaceDO : list) {
            System.out.println(interfaceDO);
        }
    }

    @Test
    public void testSelectById() {
        InterfaceDO interfaceDO = interfaceService.selectById(1);
        Assert.assertNotNull(interfaceDO);
    }

    @Test
    public void testDelectById() {
        int deleteById = interfaceService.deleteById(8);
        Assert.assertNotNull(deleteById);
        Assert.assertEquals(1, deleteById);
    }

    @Test
    public void testInsertInterface() {
        InterfaceDO interfaceDO = new InterfaceDO();
        interfaceDO.setInterfaceName("ggg");
        interfaceDO.setRequestMethod("post");
        interfaceDO.setRequestPath("http://");
        interfaceDO.setLatestUpdater("tom");
        interfaceDO.setCreateTime(new Date());
        interfaceDO.setRequestParameter("args0 args1");
        interfaceDO.setResponseParameter("args2 args3");
        int insertInterface = interfaceService.insertInterface(interfaceDO);

        Assert.assertNotNull(insertInterface);
        System.out.println(insertInterface);
    }

    @Test
    public void testUpdateById() {
        InterfaceDO interfaceDO = interfaceService.selectById(5);
        interfaceDO.setLatestUpdater("green");
        int updateById = interfaceService.updateById(interfaceDO);
        Assert.assertNotNull(updateById);
    }

}
