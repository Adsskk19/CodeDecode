package com.optional;

import java.util.Optional;

public class Employee {
	
	private int empId;
	private String empName;
	public Employee() {
		
	}
	public Employee(int empId,String empName) {
		super();
		this.empId=empId;
		this.empName= empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	public Optional<String> getEmpNameById(int empId) {
		if(empId == 10 || empId ==11) {
			return Optional.of(empName);
		}else {
			return Optional.empty();
		}
		
		
	}

	
	
	
	
	

}
