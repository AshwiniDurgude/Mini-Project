package com.braindata.bankmanagement.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.braindata.bankmanagement.dao.DaoInterface;
import com.braindata.bankmanagement.model.Account;

public class DaoImpl implements DaoInterface
{	
	@Override
	public void createTable() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankProject","root","root");
			String sql="create table bank(accNo int primary key,name varchar(25),mobNo varchar(10),adharno varchar(12),gender varchar(1),age int,balance double)";
			Statement smt=con.createStatement();
			smt.execute(sql);
			System.out.println("Table Created");

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void createAccount(Account ac) 
	{
		//Scanner sc=new Scanner(System.in);
		//System.out.println("1.Insert Record \n 2.Update Record\n 3.Delete");
		//System.out.println("Enter Your Choice:");
		//int choice=sc.nextInt();
		//switch(choice)
		//{
			//case:1
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/BankProject","root","root");
				String sql="insert into bank(accNo,name,mobNo,adharno,gender,age,balance) values(?,?,?,?,?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				int accNo = ac.getAccNo();
				ps.setInt(1,accNo);
				String name = ac.getName();
				ps.setString(2,name);
				String mobNo = ac.getMobNo();
				ps.setString(3,mobNo);
				String adharNo = ac.getAdharNo();
				ps.setString(4,adharNo);
				String gender = ac.getGender();
				ps.setString(5,gender);
				int age = ac.getAge();
				ps.setInt(6,age);
				double balance = ac.getBalance();
				ps.setDouble(7,balance);

				ps.executeUpdate();
				System.out.println("Inserted Values");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public void displayAllDetails() 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositeMoney() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawal() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void balanceCheck() {
		// TODO Auto-generated method stub
		
	}
	}


