package com.atguigu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.atguigu.bean.Person;

//������==�����ļ�
@Configuration  //����Spring����һ��������
public class MainConfig {
	
	//��������ע��һ��Bean;����Ϊ����ֵ�����ͣ�idĬ�����÷�������Ϊid
	@Bean("person01")
	public Person person01(){
		return new Person("lisi", 20);
	}

}
