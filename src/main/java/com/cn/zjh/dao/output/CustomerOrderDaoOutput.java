package com.cn.zjh.dao.output;

import java.io.Serializable;

public class CustomerOrderDaoOutput implements Serializable {

	private static final long serialVersionUID = -448448613283348947L;

	private String customerName;

	private String tradeName;

	private int number;

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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
