package com.cn.zjh.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cn.zjh.service.TransationService;
import com.cn.zjh.service.impl.TransationServiceImpl;

@Controller
public class BasicController implements Serializable {

	private static final long serialVersionUID = -5470766939120713046L;

	@Autowired
	private TransationServiceImpl transationService;

	public TransationService getTransationService() {
		return transationService;
	}

}
