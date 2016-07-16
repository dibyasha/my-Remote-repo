package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.List;

public class Role {
	private int rol;
	public Role(){
		
			List <String> listStrings= new ArrayList<String>();
			listStrings.add("1-Software engineer");
			listStrings.add("2-associate consultant");
			listStrings.add("3-consultant");
			listStrings.add("4-senior consultant");
			System.out.println(listStrings);
			}
		
			public int getRole(){
				return rol;
			}
			public void setRole(int Role)
			{
				this.rol=Role;
			}
		}
	


