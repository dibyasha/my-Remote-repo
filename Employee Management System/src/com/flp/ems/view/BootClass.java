package com.flp.ems.view;
import java.util.Scanner;

public class BootClass {
	public static void main(String []args)

	{
		BootClass B=new BootClass();
		B.menuSelection();
	}
	public void menuSelection(){
	UserInteraction obj=new UserInteraction();
	System.out.println("option 01 for AddEmployee");
	System.out.println("option 02 for ModifyEmployee");
	System.out.println("option 03 for RemoveEmployee");
	System.out.println("option 04 for SearchEmployee");
	System.out.println("option 05 for getAllEmployee");
	Scanner sc=new Scanner (System.in);
	int i=sc.nextInt();
	switch(i)
	{
	case 0:
	obj.AddEmployee();
//	case 1:
//		obj.ModifyEmployee();
//		break;
//	case 2:
//		obj.RemoveEmployee();
//		break;
//	case 3:
//		obj.SearchEmployee();
//	case 4 :
//		obj.getAllEmployee();
	}
}
}
	
	