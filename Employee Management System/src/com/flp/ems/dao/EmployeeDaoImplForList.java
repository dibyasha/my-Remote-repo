package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao{
	List<Employee> arr= new ArrayList();
	Employee o6;
	@Override
	public void AddEmployee(Employee emp) {
		o6= emp;
		arr.add(o6);
		System.out.println(arr);		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		
		
		
	}

	public void SearchEmployee(String name, String email) {
		for(Employee emply:arr)
		{		
	
		
		if(emply.getEmail_id().equals(email)){
			System.out.println("email  found");
			System.out.println(emply.toString());
		}
		else if(emply.getName().equals(name)) {
			
			System.out.println("name  found");
			System.out.println(emply.toString());
		}
		else if(emply.getName().equals(name) && emply.getEmail_id().equals(email)){
			System.out.println("name and email found");
			System.out.println(emply.toString());
		}
		}
	}

		
		

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SerachEmployee(String a) {
		// TODO Auto-generated method stub
		
	}

	

}

