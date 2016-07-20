package com.flp.ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.flp.ems.domain.Employee;


public class EmployeeDaoImplForJdbc implements IemployeeDao{
	String driver="com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/test";

	@Override
	public void ModifyEmployee(Map empModifiedDetails, int empId, int ch) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean RemoveEmployee(int empId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection dbConnection;
		dbConnection=(Connection)DriverManager.getConnection(url);
		String query = " insert into Employee (name)"
	            + " values (?)";
		PreparedStatement preparedStmt = dbConnection.prepareStatement(query);
        preparedStmt.setString (1,employee.getEmpName());
        preparedStmt.execute();
		
		return null;
	}

	@Override
	public Employee SearchEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

}
