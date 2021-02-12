package com.coforge.gitHub.Service;

import com.coforge.gitHubJavaExDaoclass.EmployeeDao;
import com.coforge.gitHubJavaExDaoclass.EmployeeDaoImp;

public class EmployeeServiceImp implements EmployeeService{
	
	private EmployeeDao ed;
	
	public	EmployeeServiceImp()
	{
		
		ed=new EmployeeDaoImp();
		
	}
	
	
	public void addEmp()
	{
		ed.addEmp();
		
	}
	public void displayEmp()
	{
		
		ed.displayEmp();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
