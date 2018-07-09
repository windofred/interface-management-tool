package com.migu.spms.service;

import com.migu.spms.dao.InterfaceMapper;
import com.migu.spms.entity.InterfaceDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
public interface InterfaceService {

    List<InterfaceDO> getAll();

    InterfaceDO selectById(Integer interfaceId);

    int deleteById(Integer interfaceId);

    int insertInterface(InterfaceDO record);

    int updateById(InterfaceDO interfaceDO);

}
