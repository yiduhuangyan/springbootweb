package com.cn.zjh.service.output;

import java.io.Serializable;

import com.cn.zjh.domain.ResponseMessage;

public class CustomerOrderOutput extends ResponseMessage implements Serializable {

	private static final long serialVersionUID = 1353060479292960417L;

	private String customerName;

	private String tradeName;

	private Integer number;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTradeName() {
		return tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
