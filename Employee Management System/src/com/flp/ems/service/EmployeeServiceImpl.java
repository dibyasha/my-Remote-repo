package com.flp.ems.service;
import java.util.ArrayList;
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
	private String kin_id;
	EmployeeDaoImplForList o4=new EmployeeDaoImplForList();
	Map<Integer,String> service;
	
	

	public void AddEmployee(Map E) {
		Employee o2= new Employee();
		 service=E;
		Name=service.get(01);
		Add=service.get(02);
		phone_no=service.get(03);
		j_date=service.get(04);
		dateofbirth=service.get(05);
		kin_id=service.get(06);
		
		o2.setName(Name);
		o2.setPhone_no(phone_no);
		o2.setAdd(Add);
		o2.setJ_date(j_date);
		o2.setdateofbirth(dateofbirth);
		o2.setEmail_id(email_id);
		o2.setKin_id(kin_id);
		EmployeeDaoImplForList E1= new EmployeeDaoImplForList();
		E1.AddEmployee(o2);
      
    		  
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

	public void SerachEmployee(String a) {
		o4.SerachEmployee(a);
		
		
	}

	@Override
	public void getAllEmployee() {
		o4.getAllEmployee();
		
	}

	

	

}
