package com.cn.zjh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.zjh.contants.ResponseEnum;
import com.cn.zjh.service.output.CustomerOrderOutput;

/**
 * 
 * @author zhujianhua
 *
 */
@Controller
@RequestMapping("/transation")
public class TransactionController extends BasicController {

	private static final long serialVersionUID = 5980974243402762286L;

	@GetMapping("/orderinfo")
	@ResponseBody
	public CustomerOrderOutput getCustomerOrderInfo() {
		CustomerOrderOutput info = new CustomerOrderOutput();
		info = this.getTransationService().getCustomerOrderInfo();
		info.setCode(ResponseEnum.SUCCESS.getCode());
		info.setMessage(ResponseEnum.SUCCESS.getMessage());
		return info;
	}
}
