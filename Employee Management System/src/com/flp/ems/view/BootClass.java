package com.flp.ems.view;
import java.util.Scanner;

public class BootClass {
	private Scanner sc;
	UserInteraction obj=new UserInteraction();
	public static void main(String []args)

	{
		BootClass B=new BootClass();
		B.menuSelection();
	}
	public void menuSelection(){

	System.out.println("option 01 for AddEmployee");
	System.out.println("option 02 for ModifyEmployee");
	System.out.println("option 03 for RemoveEmployee");
	System.out.println("option 04 for SearchEmployee");
	System.out.println("option 05 for getAllEmployee");
	sc = new Scanner (System.in);
	int i=sc.nextInt();
	switch(i)
	{
	case 1:
	obj.AddEmployee();
	this.menuSelection();
	break;
	case 2:
		obj.ModifyEmplyee();
		this.menuSelection();
		break;
	case 3:
		obj.RemoveEmployee();
		break;
	case 4:
		obj.SearchEmployee();
		this.menuSelection();
		break;
	case 5 :
		obj.getAllEmployee();
		break;
	}
}
}
	
	
