package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;

public class Project {
	private int pro;
	public Project(){
		
			List <String> listStrings= new ArrayList<String>();
			listStrings.add("1-Java");
			listStrings.add("2-SAP");
			listStrings.add("3-Spring");
			listStrings.add("4-Servlets");
			System.out.println(listStrings);
			}
		
			public int getProject(){
				return pro;
			}
			public void setProject(int Project)
			{
				this.pro=Project;
			}
}


