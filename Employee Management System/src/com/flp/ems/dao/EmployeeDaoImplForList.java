package com.flp.ems.dao;
import java.util.ArrayList;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao{

	@Override
	public void AddEmployee(Employee emp) {
		List arr= new ArrayList();
		arr.add(01, emp.getName());
		arr.add(02, emp.getAdd());
		arr.add(03, emp.getPhone_no());
		arr.add(05, emp.getJ_date());
		arr.add(06, emp.getEmail_id());
		
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

