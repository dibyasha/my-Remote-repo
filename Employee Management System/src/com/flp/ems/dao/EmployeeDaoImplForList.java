package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.domain.project;

public class EmployeeDaoImplForList implements IemployeeDao{
	List<Employee>employees=new ArrayList<Employee>();
	List<Department>departments=new ArrayList<Department>();
	List<project>projects=new ArrayList<project>();
	List<Role>roles=new ArrayList<Role>();
 
		  public Employee addEmployee( Employee emp)
	{
			  
			  
		employees.add(emp);
		departments.add(emp.getDepartment());
		projects.add(emp.getProject());
		roles.add(emp.getRole());
		return emp;
	}

		  public void ModifyEmployee(Map empModifiedDetails,int empId,int ch) {
				Employee emp=SearchEmployee(empId);
				int index=employees.indexOf(emp);
				switch(ch)
				{
				case 1: employees.get(index).setEmpName((String)empModifiedDetails.get("empName"));
						break;
				case 2:employees.get(index).setEmail((String)empModifiedDetails.get("Email"));
						break;
				}
			}
 

	
	public boolean RemoveEmployee(int empId) {
	
		for (Employee emp : employees) {
		
		      
		       if (emp.getEmpid() == empId){
		          employees.remove(emp);
		          return true;
		       }
		 }
		return false;
	}

	public Employee SearchEmployee(int empId) 
	{
		 for(Employee emp : employees) {
		        if(emp.getEmpid() == empId)
		        {
		        	return emp;
		        }
		  }
		 return null;
	}

	public List<Employee> getAllEmployee() {
		if(employees.isEmpty())
			return null;
		return employees;
	}

}
