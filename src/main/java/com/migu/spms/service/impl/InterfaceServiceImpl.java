package com.migu.spms.service.impl;

import com.migu.spms.dao.InterfaceMapper;
import com.migu.spms.entity.InterfaceDO;
import com.migu.spms.service.InterfaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("interfaceService")
@Transactional
public class InterfaceServiceImpl implements InterfaceService {

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

    public int deleteById(Integer interfaceId) {
        int deleteById = interfaceMapper.deleteById(interfaceId);
        return deleteById;
    }

    public int insertInterface(InterfaceDO interfaceDO) {
        int insertInterface = interfaceMapper.insertInterface(interfaceDO);
        return insertInterface;
    }

    public int updateById(InterfaceDO interfaceDO) {
        int updateById = interfaceMapper.updateById(interfaceDO);
        return updateById;
    }

}
