package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class EditEmployee {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Emp emp=daoObject.viewEmp(1004);
		emp.setEmpSal(15000);
		System.out.println("Employee edited");
	}

}
