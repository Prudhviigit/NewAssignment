package com.cg.service;

import java.util.List;

import com.cg.entity.Account;
import com.cg.exceptions.AccountException;

public interface AccountService {
	boolean addAccount(List<Account> list);
	boolean addAccount(Account account);
	boolean transferFund(int from, int to, double amt) throws AccountException;
	Account viewAccount(int aid) throws AccountException;
}
