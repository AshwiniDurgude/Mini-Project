package com.braindatawire.collegemanagement.client;

import java.util.Scanner;

import com.braindatawire.collegemanagement.service.Cjc;
import com.braindatawire.collegemanagement.serviceImpl.Karvenagar;

public class Test
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		Cjc college =new Karvenagar();
		int ch;
		do {  
            System.out.println("\n ***College Management System***");  
            System.out.println("1. Add Course \n 2. View Course \n 3. Add Faculty \n 4. View Faculty \n 5.Add Batch \n  6.View Batch \n 7.Add Student \n 8.View Student \n 9.Exit ");  
            System.out.println("Enter your choice: ");  
             ch = sc1.nextInt();  
                switch (ch) 
                {  
                    case 1:  
                         	{  
                         		college.addCourse(); 
                         	}  
                        break;  
                        
                    case 2:  
                    		{
                    			college.viewCourse();
                            }  
                    	break;       
                    
                    case 3: 
                    		{
                    			college.addFaculty();
                    		}

                        break;  
                    case 4:  
                    		{
                    			college.viewFaculty();
                    		}
                        break; 
                    case 5:  
            				{
            					college.addBatch();
            				}
            			break; 
                    case 6:  
            				{
            					college.viewBatch();
            				}
            			break; 
                    case 7:  
            				{
            					college.addStudent();
            				}
                             break;
                    case 8:  
    						{
    							college.viewStudent();
    						}
                     break;
                    case 9: 
                    		{
                    			System.out.println("See you soon..."); 
                    		}
                        break;  
                  
                }    
            
        } while (ch != 9);
	}
}
