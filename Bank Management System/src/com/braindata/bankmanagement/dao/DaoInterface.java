package com.braindata.bankmanagement.dao;

import com.braindata.bankmanagement.model.Account;

public interface DaoInterface 
{
	public void createTable();
	public void createAccount(Account ac);
	public void displayAllDetails();
	public void depositeMoney();
	public void withdrawal();
	public void balanceCheck();
}

