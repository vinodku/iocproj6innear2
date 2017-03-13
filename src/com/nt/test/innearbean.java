package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.person;

public class innearbean {

	public static void main(String[] args) {
		BeanFactory factory=null;
		person p=null;
		//create ioc container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationcontext.xml"));
		//get bean
		p=factory.getBean("ps",person.class);
		System.out.println(p.success());
	}

}
