package com.deloitte.emp;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="Job_role")
public class Employee {
@Id
private int empId;
private String empName;
public Employee() {
	// TODO Auto-generated constructor stub
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + "]";
}

}
