package com.flp.ems.view;
import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import com.flp.ems.domain.Employee;

public class UserInteraction {
 Employee obj2= new Employee();
 Scanner sc= new Scanner(System.in);
 private Map<Integer,String>employee= new HashMap<>();
 private int emp_id=1000;
  public <E> void AddEmployee(){
	  emp_id++;
	  UserInteraction obj=new UserInteraction();
	  obj2.setName("dibyasha sahu");
	  obj2.setPhone_no("98989823451");
	  obj2.setAdd("T-689,city road,london");
	  obj2.setJ_date("20/12/2010");
	  obj2.setdateofbirth("24/11/1994");
	  
	  String put = employee.put(new Integer(01),((Employee) obj2).getName());
	  String put1= employee.put(new Integer(02),obj2.getPhone_no());
	  employee.put(new Integer(03),obj2.getAdd());
	  String put2= employee.put(new Integer(04),obj2.getJ_date());
	  employee.put(new Integer(05),obj2.getdateofbirth());
	  
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
	  
  
	  
	  
	  
 

		



