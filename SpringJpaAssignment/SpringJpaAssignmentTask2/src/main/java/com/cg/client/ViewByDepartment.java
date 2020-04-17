package com.cg.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class ViewByDepartment {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		List<Emp> listOfEmployees= daoObject.viewEmp("hr");
		for(Emp emp:listOfEmployees)
		{
			System.out.println(emp);
			System.out.println(emp.getDept());
			System.out.println("----------------------------------------------------------------------------------");
		}
	}

}
