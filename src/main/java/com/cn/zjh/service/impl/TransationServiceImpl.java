package com.cn.zjh.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.cn.zjh.dao.output.CustomerOrderDaoOutput;
import com.cn.zjh.service.TransationService;
import com.cn.zjh.service.output.CustomerOrderOutput;

@Service
public class TransationServiceImpl extends BasicServiceImpl implements TransationService {

	@Override
	public CustomerOrderOutput getCustomerOrderInfo() {
		CustomerOrderOutput info = new CustomerOrderOutput();
		CustomerOrderDaoOutput customerOrderInfo = this.getTransationMapper().getCustomerOrderInfo();
		if (customerOrderInfo != null) {
			BeanUtils.copyProperties(customerOrderInfo, info);
		}
		return info;
	}

}
