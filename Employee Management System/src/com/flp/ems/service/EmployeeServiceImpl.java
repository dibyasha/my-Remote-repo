package com.flp.ems.service;
import java.util.Map;

import java.util.Map.Entry;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl  implements IEmployeeService{
	private int emp_id=0;
	private String j_date;
	private String dateofbirth;
	private String phone_no;
	private String Name;
	private String Add;
	private String email_id;
	
	
	

	public void AddEmployee(Map E) {
		Employee o2= new Employee();
		Map<Integer,String> service=E;
		Name=service.get(01);
		Add=service.get(02);
		phone_no=service.get(03);
		j_date=service.get(04);
		dateofbirth=service.get(05);
		
		o2.setName(Name);
		o2.setPhone_no(phone_no);
		o2.setAdd(Add);
		o2.setJ_date(j_date);
		o2.setdateofbirth(dateofbirth);
		EmployeeDaoImplForList E1= new EmployeeDaoImplForList();
      if (E1.AddEmployee(emp) e.emp_id()) &&	 (validate.valname
    		  
E1.AddEmployee(o2);
		
		
		
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
