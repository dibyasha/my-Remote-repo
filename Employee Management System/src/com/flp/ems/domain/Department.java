package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;
	public class Department {
		private int dept;
		public Department(){
			
				List <String> listStrings= new ArrayList<String>();
				listStrings.add("1-Mainframe");
				listStrings.add("2-CM");
				listStrings.add("3-Cloud");
				listStrings.add("4-Accounts");
				System.out.println(listStrings);
				}
			
				public int getDepartment(){
					return dept;
				}
				public void setDepartment(int Department)
				{
					this.dept=Department;
				}
	}

		
