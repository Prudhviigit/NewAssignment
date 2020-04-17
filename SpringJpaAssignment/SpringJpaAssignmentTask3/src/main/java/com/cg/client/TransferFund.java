package com.cg.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cg.exceptions.AccountException;
import com.cg.service.AccountService;

public class TransferFund {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(JpaConfiguration.class);
		AccountService service=context.getBean("accountser",AccountService.class);
		
		try
		{
			System.out.println(service.viewAccount(1001));
			System.out.println(service.viewAccount(1002));
			boolean res=service.transferFund(1001, 1002, 20000);
			System.out.println("Transfered : "+res);
			System.out.println(service.viewAccount(1001));
			System.out.println(service.viewAccount(1002));
		}
		catch(AccountException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
