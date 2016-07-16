package com.flp.ems.view;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
	private String kin_id;
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
	  System.out.println("Enter the kin_id");
	  kin_id=sc.next();
	  obj2.setName(Name);
	  obj2.setEmail_id(Email);
	  obj2.setPhone_no(phone_no);
	  obj2.setJ_date(j_date);
	  obj2.setdateofbirth(dateofbirth);
	  obj2.setAdd(Add);
	  obj2.setKin_id(kin_id);
	  
	  
	  
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
		  employee.put(7, kin_id);
	  }
		  o2.AddEmployee(employee);
	 
	  
  }
  private void setdateofbirth() {
	// TODO Auto-generated method stub
	
}
private void setkin_id() {
	// TODO Auto-generated method stub
	
}
private void setAdd() {
	// TODO Auto-generated method stub
	
}
private void setj_date() {
	// TODO Auto-generated method stub
	
}
private void setphone_no() {
	// TODO Auto-generated method stub
	
}
private void setEmail() {
	// TODO Auto-generated method stub
	
}
private void setName() {
	// TODO Auto-generated method stub
	
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
	  public void  SearchEmployee(){
		  
			System.out.println("01:Search by name");
			
				System.out.println("02:Search by email id");
				
				System.out.println("03:Search by kin id");
				
				System.out.println("04:Search by name and email id");
				
				System.out.println("05:Search by name and kin id");
				
				System.out.println("06:Search by email id and kin id");
			
				System.out.println("07:Search by name and email id");
				Scanner sc= new Scanner (System.in);
				int b=sc.nextInt();
				switch(b)
				{
				case 1:
					System.out.println("enter the name");
					Name=sc.next();
					o2.SerachEmployee(Name);
					break;
				case 2:
					System.out.println("enter the email id");
					Email=sc.next();
					o2.SerachEmployee(Email);
					break;
				case 3:
					System.out.println("enter the kin id");
					kin_id=sc.next();
					o2.SerachEmployee(kin_id);
					break;
				case 4:
					System.out.println("enter the name and email id");
					Name=sc.next();
					Email=sc.next();
					o2.SerachEmployee(Name);
					break;
				case 5:
					System.out.println("enter the email id and kin id");
					Email=sc.next();
					kin_id=sc.next();
					o2.SerachEmployee(Email);
					break;
				case 6:
					System.out.println("enter the name and kin id");
					Name=sc.next();
					kin_id=sc.next();
					o2.SerachEmployee(Name);
					break;
				case 7:
					System.out.println("enter the name , email_id and kin _id");
					Name=sc.next();
					Email=sc.next();
					kin_id=sc.next();
					o2.SerachEmployee(kin_id);
					break;
				    
			}
		  
	  }
	  public int getAllEmployee(){
		 o2.getAllEmployee();
		return emp_id;
	  }
		 public int RemoveEmployee()
		  {
		 System.out.println("01:Remove by name");
			
			System.out.println("02:Remove by email id");
			
			System.out.println("03:Remove by kin id");
			
			System.out.println("04:Remove by name and email id");
			
			System.out.println("05:Remove by name and kin id");
			
			System.out.println("06:Remove by email id and kin id");
		
			System.out.println("07:Remove by name and email id");
			Scanner sc= new Scanner (System.in);
			int b=sc.nextInt();
			switch(b)
			{
			case 1:
				System.out.println("enter the name");
				Name=sc.next();
				o2.RemoveEmployee();
			case 2:
				System.out.println("enter the email id");
				Email=sc.next();
				o2.RemoveEmployee();
			case 3:
				System.out.println("enter the kin id");
				kin_id=sc.next();
				o2.RemoveEmployee();
			case 4:
				System.out.println("enter the name and email id");
				Name=sc.next();
				Email=sc.next();
				o2.RemoveEmployee();
			case 5:
				System.out.println("enter the email id and kin id");
				Email=sc.next();
				kin_id=sc.next();
				o2.RemoveEmployee();
			case 6:
				System.out.println("enter the name and kin id");
				Name=sc.next();
				kin_id=sc.next();
				o2.RemoveEmployee();
			case 7:
				System.out.println("enter the name , email_id and kin _id");
				Name=sc.next();
				Email=sc.next();
				kin_id=sc.next();
				o2.RemoveEmployee();
			    
		}
			return b;
		 
	  }
  }
	  
  
	  
	  
	  
 

		



