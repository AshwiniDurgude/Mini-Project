package com.braindata.bankmanagement.serviceImpl;
import java.util.*;

import com.braindata.bankmanagement.dao.DaoInterface;
import com.braindata.bankmanagement.daoImpl.DaoImpl;
//import com.braindata.bankmanagement.dao.DaoInterface;
import com.braindata.bankmanagement.model.Account;
import com.braindata.bankmanagement.service.Rbi;
//import com.braindata.bankmanagement.model.*;
public class Sbi implements Rbi  
{
	Scanner sc=new Scanner(System.in);
	Account ac=new Account();
	DaoInterface hd=new DaoImpl();
	public void createAccount()
	{
        System.out.print("Enter Account No: ");  
         int ano = sc.nextInt(); 
         ac.setAccNo(ano);
         
        System.out.print("Enter Name: ");  
         String aname = sc.next(); 
        ac.setName(aname);
        
        System.out.print("Enter MobNo: ");  
        String mb = sc.next();
        	ac.setMobNo(mb);
        	
        System.out.print("Enter AdharNo: ");  
        ac.setAdharNo(sc.next());
        
        System.out.print("Enter Gender: ");  
        String gen = sc.next();
        ac.setGender(gen);
        
        System.out.print("Enter Age: ");  
        int ag = sc.nextInt();
        ac.setAge(ag);
        
        System.out.print("Enter Balance: ");  
        Double bal = sc.nextDouble();
        ac.setBalance(bal);
        hd.createAccount(ac);
	}
	
	public void displayAllDetails()
	{
        System.out.println("Account No: " + ac.getAccNo());  
        System.out.println("Account Name: " + ac.getName());  
        System.out.println("MobNo: " + ac.getMobNo());
        System.out.println("AdharNo: " + ac.getAdharNo());
        System.out.println("Gender: " + ac.getGender());
        System.out.println("Age: " + ac.getAge());
        System.out.println("Balance: " + ac.getBalance());
		//hd.displayAllDetails(ac);
	}
	
	public void depositeMoney()
	{ 
       System.out.println("Enter the amount you want to deposit: ");  
       double amt = sc.nextDouble();  
       Double updatedbalnace =ac.getBalance() + amt; 
       ac.setBalance(updatedbalnace);
	}
	
	public void withdrawal()
	{  
        System.out.println("Enter the amount you want to withdraw: ");  
         Double amt = sc.nextDouble();  
         Double currentbalance=ac.getBalance();
        if ( currentbalance>= amt) 
        {  
        	currentbalance = currentbalance - amt;  
        	ac.setBalance(currentbalance);
            System.out.println("Balance after withdrawal: " + currentbalance); 
         
        } 
        else 
        {  
            System.out.println("Your balance is less than " +amt  + "\tTransaction failed...!!" );  
        } 
	}
	
	public void balanceCheck()
	{
		System.out.println(ac.getBalance());
	}

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		hd.createTable();
	}


}
