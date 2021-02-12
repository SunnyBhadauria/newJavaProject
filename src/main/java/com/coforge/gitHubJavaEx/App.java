package com.coforge.gitHubJavaEx;

import java.util.Scanner;

import com.coforge.gitHub.Service.EmployeeServiceImp;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmployeeServiceImp e = new  EmployeeServiceImp();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Press 1 for add emp");
    	System.out.println("Press2 for display emp");
    	switch(sc.nextInt())
    	{
    	case 1:
    		e.addEmp();
    	
    	case 2: 
    		e.displayEmp();
    		break;
    		
    	default:
    		System.out.println("Wrong choice");
    			break;
    
    	}
   
    
    
        
    }
}
