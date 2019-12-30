package com.cn.zjh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.cn.zjh.dao.mapper.TransationMapper;

public class BasicServiceImpl {

	@Autowired
	private TransationMapper transationMapper;

	public TransationMapper getTransationMapper() {
		return transationMapper;
	}

}
