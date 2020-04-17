package com.cg.client;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.dao.IEmpDao;
import com.cg.entity.Emp;

public class AddEmp {

	public static void main(String[] args) {
		ApplicationContext context= new AnnotationConfigApplicationContext(JpaConfiguration.class);
		IEmpDao daoObject= context.getBean("mydao",IEmpDao.class);
		Emp emp=new Emp();
		emp.setEmpId(1001);
		emp.setEmpName("Shubham");
		emp.setEmpSal(55000);
		emp.setDoj(LocalDate.of(2016, 07, 21));
		emp.getDept().setDeptId(15);
		daoObject.addEmp(emp);
		
		emp=new Emp();
		emp.setEmpId(1002);
		emp.setEmpName("shashwat");
		emp.setEmpSal(45000);
		emp.setDoj(LocalDate.of(2016, 07, 21));
		emp.getDept().setDeptId(16);
		daoObject.addEmp(emp);
		
		emp=new Emp();
		emp.setEmpId(1003);
		emp.setEmpName("madhu");
		emp.setEmpSal(50000);
		emp.setDoj(LocalDate.of(2016, 07, 22));
		emp.getDept().setDeptId(17);
		daoObject.addEmp(emp);
		
		emp=new Emp();
		emp.setEmpId(1004);
		emp.setEmpName("yogesh");
		emp.setEmpSal(45000);
		emp.setDoj(LocalDate.of(2016, 07, 23));
		emp.getDept().setDeptId(15);
		daoObject.addEmp(emp);
		System.out.println("Employee added");
	}

}
