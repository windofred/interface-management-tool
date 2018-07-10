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
/**
 *
 */
public class InterfaceServiceImpl implements InterfaceService {

    /**
     * 注入InterfaceMapper接口
     */
    @Autowired
    private InterfaceMapper interfaceMapper;

    /**
     * 新增接口
     * @param interfaceDO
     */
    @Override
    public void saveInterface(InterfaceDO interfaceDO) {
        interfaceMapper.saveInterface(interfaceDO);
    }

    /**
     * 更新接口
     * @param interfaceDO
     * @return
     */
    @Override
    public boolean updateInterface(InterfaceDO interfaceDO) {
        return interfaceMapper.updateInterface(interfaceDO);
    }

    /**
     * 根据Id删除接口
     * @param interfaceId
     * @return
     */
    @Override
    public boolean deleteInterface(Integer interfaceId) {
        return interfaceMapper.deleteInterface(interfaceId);
    }

    /**
     * 根据id查找接口
     * @param interfaceId
     * @return
     */
    @Override
    public InterfaceDO findInterfaceById(Integer interfaceId) {
        InterfaceDO interfaceDO = interfaceMapper.findInterfaceById(interfaceId);
        return interfaceDO;
    }

    /**
     * 查询所有接口
     * @return
     */
    @Override
    public List<InterfaceDO> findAll() {
        List<InterfaceDO> allInterface = interfaceMapper.findAll();
        return allInterface;
    }
}
