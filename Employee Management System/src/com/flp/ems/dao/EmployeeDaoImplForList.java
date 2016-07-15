package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao{
	List arr= new ArrayList();
	@Override
	public void AddEmployee(Employee emp) {
		
		arr.add(emp);
		System.out.println(arr);		
	}

	@Override
	public void ModifyEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SerachEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}
	

}

