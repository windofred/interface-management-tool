package com.migu.spms.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by sala on 2018/7/8.
 */
public class InterfaceDO implements Serializable {

    private Integer interfaceId;
    private String interfaceName;
    private String requestMethod;
    private String requestPath;
    private String latestUpdater;
    private String createTime;
    private String requestParameter;
    private String responseParameter;

    public String getRequestPath() {
        return requestPath;
    }

    public void setRequestPath(String requestPath) {
        this.requestPath = requestPath;
    }

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

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getLatestUpdater() {
        return latestUpdater;
    }

    public void setLatestUpdater(String latestUpdater) {
        this.latestUpdater = latestUpdater;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getRequestParameter() {
        return requestParameter;
    }

    public void setRequestParameter(String requestParameter) {
        this.requestParameter = requestParameter;
    }

    public String getResponseParameter() {
        return responseParameter;
    }

    public void setResponseParameter(String responseParameter) {
        this.responseParameter = responseParameter;
    }

    @Override
    public String toString() {
        return "InterfaceDO{" +
                "interfaceId=" + interfaceId +
                ", interfaceName='" + interfaceName + '\'' +
                ", requestMethod='" + requestMethod + '\'' +
                ", requestPath='" + requestPath + '\'' +
                ", latestUpdater='" + latestUpdater + '\'' +
                ", createTime='" + createTime + '\'' +
                ", requestParameter='" + requestParameter + '\'' +
                ", responseParameter='" + responseParameter + '\'' +
                '}';
    }
}
