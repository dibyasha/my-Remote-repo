package com.flp.ems.domain;

public class Employee {
	private int emp_id=0;
	private String phone_no;
	private String Name;
	private String Add;
	private String j_date;
	private String dateofbirth;
	private String email_id;
	private String kin_id;
	
	public String getName(){
		return Name;
	}
	
	public String getPhone_no(){
	return phone_no;
}
public void setPhone_no(String l){
	phone_no=l;
}
public void setAdd(String add)
{
	Add=add;
}
public String getAdd(){
	return Add;
}

public void setdateofbirth(String j_dateofbirth){

	this.dateofbirth=j_dateofbirth;
}
public String getdateofbirth(){
	return dateofbirth;
}
public void setEmail_id(String email_id){

	this.email_id=email_id;
}
public String getEmail_id(){
	return email_id;
}
		
public String getJ_date() {
	return this.j_date;
	
	
}
public void setName(String name) {
	this.Name=name;
}

public void setJ_date(String j_date2) {
	this.j_date=j_date2;
	
}

public void setKin_id(String kin_id2) {
	this.kin_id=kin_id;
	// TODO Auto-generated method stub
}

public String getkin_id(){
	return kin_id;
}

}
