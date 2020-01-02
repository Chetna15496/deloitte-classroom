package com.deloitte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

@SuppressWarnings("unused")
public class EmployeeCrudOperations {

	
	public static void main(String[] args) throws SQLException, IOException {
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
		//Scanner sc= new Scanner(System.in);
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
/*System.out.print("Enter a dept no: ");
int deptNo=Integer.parseInt(in.readLine());
System.out.print("Enter a dept name: ");
String deptName=in.readLine();
System.out.print("Enter a location: ");
String loc=in.readLine();*/
    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","admin");//1
	
  //  if(con!=null)
   // {
   // 	System.out.println("Connection Successful");
    //}
   // Statement smt=con.createStatement();//2
   /* System.out.println("Enter job role: ");
    String job=in.readLine();
    
    ResultSet rs=smt.executeQuery("select * from emp");//3
    rs= smt.executeQuery("select * from emp where empno=7844");
    rs= smt.executeQuery("select * from emp where job='"+job+"'");
    System.out.println("Emp IDs   Emp Name" );
    while(rs.next())
    {
    	System.out.println(rs.getInt(1)+"      "+rs.getString(2));}//4*/
   // int r=smt.executeUpdate("insert into dept values("+sc.nextInt()+",'"+sc.next()+"','"+sc.next()+"')");
  //  if(r>0) {
    //	System.out.println("Data Inserted");
   /// }
  //  PreparedStatement psmt=con.prepareStatement("insert into dept values(?,?,?)");
   // psmt.setInt(1,deptNo);
    //psmt.setString(2,deptName);
    //psmt.setString(3, loc);
    System.out.println("Enter data:"); //UPDATE
    int deptNo=Integer.parseInt(in.readLine());
    String deptName=in.readLine();
    PreparedStatement psmt = con.prepareStatement("update dept set dname=? where deptno=? ");
   
    psmt.setInt(2,deptNo);
    psmt.setString(1,deptName);
    int r=psmt.executeUpdate();
    if(r>0) {
       	System.out.println(r+" Data Updated");
         	
        }
    System.out.println("Enter deptno:");//DELETE
     deptNo=Integer.parseInt(in.readLine());
     psmt = con.prepareStatement("delete from dept where deptno=?");
     psmt.setInt(1, deptNo);
     r=psmt.executeUpdate();
     if(r>0) {
        	System.out.println(r+" Data deleted");
          	
         }
     
    
	}

}
