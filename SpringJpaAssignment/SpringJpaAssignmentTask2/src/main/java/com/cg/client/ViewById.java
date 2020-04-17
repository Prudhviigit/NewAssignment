package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class ViewById {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Emp emp=daoObject.viewEmp(1001);
		System.out.println(emp);
	}

}
