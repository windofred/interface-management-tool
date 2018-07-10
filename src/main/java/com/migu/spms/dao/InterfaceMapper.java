package com.migu.spms.dao;

import com.migu.spms.entity.InterfaceDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
public interface InterfaceMapper {

    void saveInterface(InterfaceDO interfaceDO);

    boolean updateInterface(InterfaceDO interfaceDO);

    boolean deleteInterface(Integer interfaceId);

    InterfaceDO findInterfaceById(Integer interfaceId);

    List<InterfaceDO> findAll();

}
