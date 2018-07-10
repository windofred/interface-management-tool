package com.migu.spms.util;

import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 * 
 * @author lfy
 * 
 */
public class Msg {
	//状态码   100-成功    200-失败
	private int code;
	//提示信息
	private String remark;
	
	//用户要返回给浏览器的数据
	private Map<String, Object> result = new HashMap<String, Object>();

	public static Msg success(){
		Msg result = new Msg();
		result.setCode(100);
		result.setRemark("处理成功！");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(200);
		result.setRemark("处理失败！");
		return result;
	}
	
	public Msg add(String key,Object value){
		this.getResult().put(key, value);
		return this;
	}
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
}
