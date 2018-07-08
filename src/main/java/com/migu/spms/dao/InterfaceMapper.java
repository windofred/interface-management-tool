package com.migu.spms.dao;

import com.migu.spms.entity.InterfaceDO;

import java.util.List;

/**
 * Created by sala on 2018/7/8.
 */
public interface InterfaceMapper {

    List<InterfaceDO> getAll();

    InterfaceDO selectById(Integer interfaceId);

}
