package com.braindata.bankmanagement.client;
import java.util.*;

import com.braindata.bankmanagement.service.Rbi;
import com.braindata.bankmanagement.serviceImpl.Sbi;
public class Test 
{
	public static void main(String [] arg)
	{
		Scanner sc1=new Scanner(System.in);
	
	Rbi bank=new Sbi();
		int ch;
	         
	        do {  
	            System.out.println("\n ***Bank Management System***");  
	            System.out.println("0.Create Table \n 1. Create Account \n 2. Display Account Details\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Check Balance \n 6.Exit ");  
	            System.out.println("Enter your choice: ");  
	             ch = sc1.nextInt();  
	                switch (ch) 
	                {  
	                case 0:  
                 	{  
                 		bank.createTable(); 
                 	}  
                break;
	                    case 1:  
	                         	{  
	                         		bank.createAccount(); 
	                         	}  
	                        break;  
	                        
	                    case 2:  
	                    		{
	                                 bank.displayAllDetails();
	                            }  
	                    	break;       
	                    
	                    case 3: 
	                    		{
	                    			bank.depositeMoney();
	                    		}
  
	                        break;  
	                    case 4:  
	                    		{
	                    			bank.withdrawal();
	                    		}
	                        break;  
	                    case 5:  
                				{
                					bank.balanceCheck();
                				}
                                 break;
	                    case 6: 
	                    		{
	                    			System.out.println("See you soon..."); 
	                    		}
	                        break;  
	                  
	                }    
	            
	        } while (ch != 7);
	}
}


