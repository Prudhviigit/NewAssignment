package com.cg.dao;

import com.cg.entity.Account;
import com.cg.exceptions.AccountException;

public interface AccountDao {

	boolean addAccount(Account account);
	boolean editAccount(Account account);
	Account getAccount(int aid) throws AccountException;

}
