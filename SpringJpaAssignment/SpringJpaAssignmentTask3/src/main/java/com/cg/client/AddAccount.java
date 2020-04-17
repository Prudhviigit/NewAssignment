package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.entity.Account;
import com.cg.service.AccountService;

public class AddAccount {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JpaConfiguration.class);
		AccountService service=context.getBean("accountser",AccountService.class);
		Account acc1=new Account();
		acc1.setAccId(1001);
		acc1.setCustName("shubham");
		acc1.setBalance(55000);
		service.addAccount(acc1);
		
		Account acc2=new Account();
		acc2.setAccId(1002);
		acc2.setCustName("ram");
		acc2.setBalance(5000);
		service.addAccount(acc2);
		
		System.out.println("account created");
	}

}
