package com.migu.spms.entity;

import java.util.Date;

/**
 * Created by sala on 2018/7/8.
 */
public class InterfaceDO {

    private Integer interfaceId;
    private String interfaceName;
    private String interfaceUri;
    private String latestUpdater;
    private Date updateDate;

    public Integer getInterfaceId() {
        return interfaceId;
    }

    public void setInterfaceId(Integer interfaceId) {
        this.interfaceId = interfaceId;
    }

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getInterfaceUri() {
        return interfaceUri;
    }

    public void setInterfaceUri(String interfaceUri) {
        this.interfaceUri = interfaceUri;
    }

    public String getLatestUpdater() {
        return latestUpdater;
    }

    public void setLatestUpdater(String latestUpdater) {
        this.latestUpdater = latestUpdater;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
