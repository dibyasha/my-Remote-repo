package com.flp.ems.service;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import com.flp.ems.dao.EmployeeDaoImplForJdbc;
import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.dao.IemployeeDao;
import com.flp.ems.domain.Department;
import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.domain.project;

public class EmployeeServiceImpl implements IEmployeeService {
	

	IemployeeDao empDao, empDaojdbc;
	public EmployeeServiceImpl()
	{
//		empDao=new EmployeeDaoImplForList();
		empDaojdbc= (IemployeeDao) new EmployeeDaoImplForJdbc();
	}
	
	HashSet hs = new HashSet();
	public Employee addEmployee(Map empDetails) throws ClassNotFoundException, SQLException{
		//Creating new objects for domain class
		
		Employee employee=new Employee();
		Department department=new Department();
		project project=new project();
		Role role=new Role();
  
		
		employee.setEmpid((Integer) empDetails.get("empId"));
		employee.setEmpName((String) empDetails.get("empName"));
        employee.setEmail((String) empDetails.get("Email"));
        employee.setPhone_no((String)empDetails.get("phone_no"));
        employee.setDOB((String)empDetails.get("DOB"));
        employee.setDOJ((String)empDetails.get("DOJ"));
        employee.setEmpAddress((String)empDetails.get("empAddress"));
        
		department.setDept_id((Integer) empDetails.get("Dept_Id"));
		department.setDeptName((String) empDetails.get("deptName"));
		department.setDeptDesc((String) empDetails.get("DeptDesc"));
        employee.setDepartment(department);

		project.setPro_id((Integer) empDetails.get("proj_Id"));
		project.setProName((String) empDetails.get("proj_Name"));
		project.setProDescription((String) empDetails.get("ProDescription"));
		project.setDepartment(department);

		employee.setProject(project);

		role.setRole_id((Integer) empDetails.get("Role_Id"));
		role.setRName((String) empDetails.get("RName"));
        role.setRDesc((String)empDetails.get("RDesc"));
		employee.setRole(role);

		if(hs.contains(employee.getEmpid()))
		{
			System.out.println("employee id already exists");
		}
		else
		{
			hs.add((Integer) empDetails.get("empId"));
		}
		if(hs.contains(employee.getEmail()))
		{
			System.out.println("Email already exists");
		}
		else
		{
			hs.add((String) empDetails.get("Email"));
		}

		
//		return empDao.addEmployee(employee);  
		return empDaojdbc.addEmployee(employee);
	}
	
	
	public void ModifyEmployee(Map empModifiedDetails,int empId,int ch) {
		empDao.ModifyEmployee(empModifiedDetails,empId,ch);
		
	}

	
	public boolean RemoveEmployee(int empId) {
		return empDao.RemoveEmployee(empId);
	}

	
	public Employee SearchEmployee(int empId){
		
		return empDao.SearchEmployee(empId);
	}

	public List<Employee> getAllEmployee() {
		return empDao.getAllEmployee();
	}

}
