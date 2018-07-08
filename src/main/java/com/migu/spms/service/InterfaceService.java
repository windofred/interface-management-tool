package com.migu.spms.service;

import com.migu.spms.dao.InterfaceMapper;
import com.migu.spms.entity.InterfaceDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
@Service
public class InterfaceService {

    @Autowired
    private InterfaceMapper interfaceMapper;

    public List<InterfaceDO> getAll() {
        List<InterfaceDO> list = interfaceMapper.getAll();
        return list;
    }

    public InterfaceDO selectById(Integer interfaceId) {
        InterfaceDO interfaceDO = interfaceMapper.selectById(interfaceId);
        return interfaceDO;
    }

}
