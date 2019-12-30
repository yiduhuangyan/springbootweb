package com.cn.zjh.aop;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class ServiceErrorHandleAop {

	@Pointcut("execution(public * com.cn.zjh.service..*.*(..))")
	public void exceptionHandle() {
		System.out.println("异常处理");
	}
}
