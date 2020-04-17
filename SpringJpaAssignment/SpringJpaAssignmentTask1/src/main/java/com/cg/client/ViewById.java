package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class ViewById {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jpaconfig.xml");
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Emp emp=daoObject.viewEmp(1001);
		System.out.println(emp);
	}

}
