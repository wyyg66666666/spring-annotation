package com.atguigu.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

import com.atguigu.bean.Blue;

@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor{

	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanDefinitionRegistryPostProcessor...bean��������"+beanFactory.getBeanDefinitionCount());
	}

	//BeanDefinitionRegistry Bean������Ϣ�ı������ģ��Ժ�BeanFactory���ǰ���BeanDefinitionRegistry���汣���ÿһ��bean������Ϣ����beanʵ����
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanDefinitionRegistry...bean��������"+registry.getBeanDefinitionCount());
		//��ʽ1��
		//RootBeanDefinition beanDefinition = new RootBeanDefinition(Blue.class);
		//��ʽ2��
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(Blue.class).getBeanDefinition();
		//��IOC����ע��һ��bean
		registry.registerBeanDefinition("hello", beanDefinition);
	}

}
