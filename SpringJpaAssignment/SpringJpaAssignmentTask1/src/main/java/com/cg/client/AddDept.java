package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Dept;

public class AddDept {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jpaconfig.xml");
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Dept deptObject= new Dept();
		deptObject.setDeptName("hr");
		daoObject.addDept(deptObject);
		
		deptObject= new Dept();
		deptObject.setDeptName("finance");
		daoObject.addDept(deptObject);
		
		deptObject= new Dept();
		deptObject.setDeptName("production");
		daoObject.addDept(deptObject);
		System.out.println("Dept added");
	}
}
