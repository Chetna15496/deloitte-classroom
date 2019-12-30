package com.deloitte;

public class EmployeeAdder {

	public void addEmployee(Employee emp) throws Exception
	{
		if(emp.getEmpId()<10000 || emp.getEmpId()>99999) {
			throw new InvalidEmployeeIdException("Invalid Id Entered");
		}
		if(emp.getEmpName().length()<3)
		{
			throw new InvalidEmployeeNameException("Invalid Name Entered");
		}
		if(emp.getSalary()<30000 || emp.getSalary()>80000)
		{
			throw new InvalidEmployeeSalaryException("Wrong Salary");
		}
		System.out.println("Added Successfully");
	}
}
