package com.atguigu.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Audience {

	// 表演之前
	@Before("execution(** com.atguigu.aop.Performance.perform(..))")
	public void silenceCellPhones() {
		System.out.println("silencing cell phones");
	}

	// 表演之前
	@Before("execution(** com.atguigu.aop.Performance.perform(..))")
	public void takeSeats() {
		System.out.println("Taking seats");
	}

	// 表演之后
	@AfterReturning("execution(** com.atguigu.aop.Performance.perform(..))")
	public void applause() {
		System.out.println("CLAP CLAP CLAP");
	}

	// 表演失败之后
	@AfterThrowing("execution(** com.atguigu.aop.Performance.perform(..))")
	public void demandRefund() {
		System.out.println("demanding is refund");
	}

}
