package com.flp.ems.view;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;

public class UserInteraction {
 Employee obj2= new Employee();
 Scanner sc= new Scanner(System.in);
 private Map<Integer,String>employee= new HashMap<>();
 private int emp_id=1000;
 private String Email;
 private String phone_no;
	private String Name;
	private String Add;
	private String j_date;
	private String dateofbirth;
  public <E> void AddEmployee(){
	  emp_id++;
	  UserInteraction obj=new UserInteraction();
	  System.out.println("Enter the employee name");
	  Name=sc.next();
	  System.out.println("enter email_id");
	  Email=sc.next();
	  System.out.println("Enter the employee phone number");
	  phone_no=sc.next();
	  System.out.println("Enter the employee name");
	  Name=sc.next();
	  System.out.println("Enter the employee joining date");
	  j_date=sc.next();
	  System.out.println("Enter the employee date of birth");
	  dateofbirth=sc.next();
	  
	  
	  
	  
	  
	  String put = employee.put(new Integer(01),((Employee) obj2).getName());
	  String put1= employee.put(new Integer(02),obj2.getPhone_no());
	  employee.put(new Integer(03),obj2.getAdd());
	  String put2= employee.put(new Integer(04),obj2.getJ_date());
	  employee.put(new Integer(05),obj2.getdateofbirth());
	  Validate.validateLetters(obj2.getName());
	  Validate.Phonenumber(obj2.getPhone_no());
	  Validate.validate(obj2.getEmail_id());
	  Validate.isvalid(obj2.getdateofbirth());
	  Validate.isvalid(obj2.get j_date());
	 
	  
  }
  public void ModifyEmplyee()
  {
	  System.out.println("Employee details is :  ");
	  System.out.println("Enter the employee details  with ID:" + emp_id);
	  for(Entry<Integer,String> e: employee.entrySet()){
		  System.out.println(e.getKey()+ ":" + e.getValue());
	  }
  }
  
 public void RemoveEmployee()
  {
	 
  }
	  public int SearchEmployee(){
		  return 0;
	  }
	  public int getAllEmployee(){
		  return 0;
	  }
  }
	  
  
	  
	  
	  
 

		



