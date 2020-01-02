package com.deloitte;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeCrudOperations {

	public static void main(String[] args) throws SQLException {
	/*
	 * Create Operation--1
	 * 
	 * 
	 * Create Statement--2
	 * 
	 * 
	 * Execute Query--3
	 * 
	 * 
	 * Process ResultSet--4	
	 */
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");//1
	
    if(con!=null)
    {
    	System.out.println("Connection Successful");
    }
    Statement smt=con.createStatement();//2
    
    ResultSet rs= smt.executeQuery("select * from emp");
    System.out.println("Emp IDs   Emp Names");
    while(rs.next())
    {
    	System.out.println(rs.getInt(1)+"      "+rs.getString(2));
    }
	}

}
