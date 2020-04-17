package com.cg.client;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class ViewAll {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("jpaconfig.xml");
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		List<Emp> listOfEmployees= daoObject.viewEmp();
		for(Emp emp:listOfEmployees)
		{
			System.out.println(emp);
			System.out.println(emp.getDept());
			System.out.println("----------------------------------------------------------------------------------");
		}
	}

}
