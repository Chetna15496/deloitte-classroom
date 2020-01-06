package com.deloitte.emp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
    SessionFactory sf= new Configuration().configure().
    		addAnnotatedClass(Employee.class).
    		addAnnotatedClass(SysEngg.class).
    		addAnnotatedClass(DelConsult.class).
    		buildSessionFactory();
    SysEngg se=new SysEngg();
    se.setEmpId(102);
    se.setDevProfile("web dev");
    se.setEmpName("Mani");
    se.setLang("java");
    
    DelConsult dc=new DelConsult();
    dc.setEmpId(502);
    dc.setEmpName("Rohit");
    dc.setTestProfile("Sys Tech");
    dc.setTestTech("Selenium");
    
    Session ssn=sf.openSession();
    Transaction tx= ssn.beginTransaction();
    ssn.save(se);
    ssn.save(dc);
    tx.commit();
    ssn.close();
    
    
    

	}

}
