package com.migu.spms.entity;

import java.io.Serializable;

/**
 * Created by sala on 2018/7/8.
 */
public class InterfaceDO implements Serializable {
    /**
     * 接口Id
     */
    private Integer interfaceId;
    /**
     * 接口名称
     */
    private String interfaceName;
    /**
     * 请求方式
     */
    private String requestMethod;
    /**
     * 请求路径
     */
    private String requestPath;
    /**
     * 最近更新者
     */
    private String latestUpdater;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 请求参数
     */
    private String requestParameter;
    /**
     * 响应参数
     */
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

}
