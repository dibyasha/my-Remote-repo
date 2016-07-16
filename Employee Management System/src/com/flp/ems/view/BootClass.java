package com.flp.ems.view;
import java.util.Scanner;

public class BootClass {
	private Scanner sc;
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
	sc = new Scanner (System.in);
	int i=sc.nextInt();
	switch(i)
	{
	case 0:
	obj.AddEmployee();
	break;
	case 1:
		obj.ModifyEmplyee();
		break;
	case 2:
		obj.RemoveEmployee();
		break;
	case 3:
		obj.SearchEmployee();
		break;
	case 4 :
		obj.getAllEmployee();
		break;
	}
}
}
	
	
