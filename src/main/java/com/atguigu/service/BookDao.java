package com.atguigu.service;

import org.springframework.stereotype.Repository;

//����Ĭ������������ĸСд
@Repository("bookDao1")
public class BookDao {
	
	private String lable = "1";

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	@Override
	public String toString() {
		return "BookDao1 [lable=" + lable + "]";
	}

}
