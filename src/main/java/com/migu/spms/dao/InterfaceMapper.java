package com.migu.spms.dao;

import com.migu.spms.entity.InterfaceDO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
public interface InterfaceMapper {

    List<InterfaceDO> getAll();

    InterfaceDO selectById(Integer interfaceId);

    int deleteById(Integer interfaceId);

    int insertInterface(InterfaceDO record);

    int updateById(InterfaceDO interfaceDO);

}
