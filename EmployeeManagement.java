package com.deloitte;

public class EmployeeManagement {

	public static void main(String[] args) {
	Employee emp=new Employee(10111,"Mahi",50000);
	EmployeeAdder empAdd=new EmployeeAdder();
	try {
	empAdd.addEmployee(emp);
	}
	catch(Exception e) {
		System.out.println("Error is: "+e.getMessage());
	}
	}

}
