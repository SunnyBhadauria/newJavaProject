package com.coforge.gitHubJavaExDaoclass;

import java.util.Scanner;

import com.coforge.gitHub.Service.EmployeeService;
import com.coforge.gitHubJavaExBeanClass.Employee;

public class EmployeeDaoImp  implements EmployeeDao {
	
Employee e=null;
Scanner sc=new Scanner(System.in);

public  EmployeeDaoImp()
{
	e=new Employee();	
}
	public void addEmp()
	{
	
		e.setEmpId(sc.nextInt());
		e.setEmpName(sc.next());
		e.setEmpPhone(sc.nextLong());
		e.setEmpEmail(sc.next());
		
		
		
		
		
	}
	public void displayEmp()
	{
	System.out.println(e.getEmpId());	
	System.out.println(e.getEmpName());
	System.out.println(e.getEmpPhone());
	System.out.println(e.getEmpEmail());
		
	}
	
	

}
