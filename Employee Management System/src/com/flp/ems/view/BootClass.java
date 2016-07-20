package com.flp.ems.view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

	public class BootClass {
	
		
		static UserInteraction o1=new UserInteraction();	
		static Scanner sc=new Scanner(System.in);
		public static void main(String args[]) throws ClassNotFoundException, SQLException
		{   
			int ch;
			while(true)
			{
				System.out.println("Tasks");
				System.out.println("Enter ur choice 1.Addition 2.Modification 3.Remove 4.Searching 5.GetAllEmp");
				ch=sc.nextInt();
				menuSelection(ch);
			}
	}
		
	public static void menuSelection(int ch) throws ClassNotFoundException, SQLException{
		Employee emp;
		List<Employee> emps;
		switch(ch)
		{
			case 1:
				    emp=o1.AddEmployee();
					if(emp != null)
						System.out.println("Employee added is "+emp);
					else
						System.out.println("Failed to add the Employee");
					break;
			case 2:o1.ModifyEmployee();
					break;
			case 3:System.out.println("Employee removal  status is "+o1.RemoveEmployee());
              		break;
			case 4:emp=o1.SearchEmployee();
					if(emp != null)
						System.out.println("Employee Found "+emp);
					else
						System.out.println("Employee Not Found");
					break;
			case 5:emps=o1.getAllEmployee();
					if(emps != null)
						System.out.println("All Employees details are "+emps);
					else
						System.out.println("No Employees Found");
					break;
			case 6:System.exit(0);       
		}
	}
}
