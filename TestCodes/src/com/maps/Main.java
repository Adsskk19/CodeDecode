package com.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
	
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, Employee> employees = new HashMap<Integer,Employee>();
		Employee emp1 = new Employee(100,"kiran",95000);
		Employee emp2 = new Employee(101,"teja",75000);
		Employee emp3 = new Employee(102,"mahi",80000);
		Employee emp4 = new Employee(103,"virat",90000);
		
		employees.put(emp1.getId(), emp1);
		employees.put(emp2.getId(), emp2);
		employees.put(emp3.getId(), emp3);
		employees.put(emp4.getId(), emp4);
//		System.out.println(employees);
//		for(Map.Entry<Integer, Employee> entry:employees.entrySet()) {
//			System.out.println(entry.getKey()+":  "+entry.getValue());
//		}
		System.out.println(employees.get(100));
		System.out.println(employees.get(101));
		System.out.println(employees.get(102));
		System.out.println(employees.get(103));

		
	}

}

class Employee {

	private int id;
	private String empName;
	private double salary;

	public Employee() {

	}
	public Employee(int id, String empName, double salary) {
		super();
		this.id = id;
		this.empName=empName;
		this.salary=salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + empName + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(empName, id, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empName, other.empName) && id == other.id
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	
//	@Override
//	public String toString() {
//		return "Employee [id= "+id+", empName="+empName + ",salary ="+ salary +"]";
//		
//	}
	
	
	

}
