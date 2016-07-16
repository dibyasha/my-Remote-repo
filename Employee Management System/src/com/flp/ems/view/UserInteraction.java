package com.flp.ems.view;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {
 Employee obj2= new Employee();
 EmployeeServiceImpl o2= new EmployeeServiceImpl();
 Scanner sc= new Scanner(System.in);
 private Map<Integer,String>employee= new HashMap<>();
    private int emp_id=1000;
    private String Email;
    private String phone_no;
	private String Name;
	private String Add;
	private String j_date;
	private String dateofbirth;
  public  void AddEmployee(){
	  emp_id++;
	  UserInteraction obj=new UserInteraction();
	  System.out.println("Enter the employee name");
	  Name=sc.next();
	  System.out.println("enter email_id");
	  Email=sc.next();
	  System.out.println("Enter the employee phone number");
	  phone_no=sc.next();
	  System.out.println("Enter the employee joining date");
	  j_date=sc.next();
	  System.out.println("Enter the employee date of birth");
	  dateofbirth=sc.next();
	  System.out.println("Enter the Address");
	  Add=sc.next();
	  
//	  String put = employee.put(new Integer(01),((Employee) obj2).getName());
//	  String put1= employee.put(new Integer(02),obj2.getPhone_no());
//	  employee.put(new Integer(03),obj2.getAdd());
//	  String put2= employee.put(new Integer(04),obj2.getJ_date());
//	  employee.put(new Integer(05),obj2.getdateofbirth());
	  
	  boolean flag1=Validate.validateLetters(obj2.getName());
	  boolean flag2=Validate.PhoneNumber(obj2.getPhone_no());
	  boolean flag3=Validate.validate(obj2.getEmail_id());
	  boolean flag4=Validate.isValid(obj2.getdateofbirth());
	  boolean flag5=Validate.isValid(obj2.getJ_date());
	  if(flag1 && flag2 && flag3 && flag4 && flag5)
	  {
		  employee.put(1,Name);
		  employee.put(2,Email);
		  employee.put(3,phone_no);
		  employee.put(4,Add);
		  employee.put(5,j_date);
		  employee.put(6,dateofbirth);
	  }
		  o2.AddEmployee(employee);
	 
	  
  }
  public void ModifyEmplyee()
  {
	  System.out.println("Employee details is :  ");
	  System.out.println("Enter the employee details  with ID:" + emp_id);
  }
//	  for(Entry<Integer,String> e: employee.entrySet()){
//		  System.out.println(e.getKey()+ ":" + e.getValue());
//	  }
//  }
  
 public void RemoveEmployee()
  {
	
  }
	  public int SearchEmployee(){
		  return 0;
	  }
	  public int getAllEmployee(){
		 o2.getAllEmployee();
		  return 0;
	  }
  }
	  
  
	  
	  
	  
 

		



