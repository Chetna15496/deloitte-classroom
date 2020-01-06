package com.deloitte.emp;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class App {

	public static void main(String[] args) {
    SessionFactory sf= new Configuration().configure().
    		addAnnotatedClass(Employee.class).
    		addAnnotatedClass(SysEngg.class).
    		addAnnotatedClass(DelConsult.class).
    		buildSessionFactory();
//    SysEngg se=new SysEngg();
//    se.setEmpId(102);
//    se.setDevProfile("web dev");
//    se.setEmpName("Mani");
//    se.setLang("java");
//    
//    DelConsult dc=new DelConsult();
//    dc.setEmpId(502);
//    dc.setEmpName("Rohit");
//    dc.setTestProfile("Sys Tech");
//    dc.setTestTech("Selenium");
//   
    
   Session ssn=sf.openSession();
   Criteria ctr= ssn.createCriteria(DelConsult.class);
   ctr.add(Restrictions.eq("testTech","Selenium"));
   System.out.println(ctr.list());
   
//   Query q= ssn.getNamedQuery("byTestTech");
//   q.setParameter("tech","Selenium");
//   DelConsult dc = (DelConsult)q.getSingleResult();
//   
//   
  // Query q=ssn.createQuery("from SysEngg where lang='java'");
   
//   Query q=ssn.createQuery("from SysEngg where lang=:inputlang");
//   q.setParameter("inputlang", "java");
//   
//   SysEngg se= (SysEngg)q.getSingleResult();
//   
   
   // SysEngg se=ssn.get(SysEngg.class, 102);//
   //System.out.println(se);//fetch value of obj as per the id
    Transaction tx= ssn.beginTransaction();
    //ssn.save(se);
  // ssn.save(dc);
    tx.commit();
    ssn.close();
    
//    System.out.println("Emp Id- "+dc.getEmpId());
//    System.out.println("Emp Name- "+dc.getEmpName());
//    System.out.println("Emp Id- "+dc.getTestProfile());
//    System.out.println("Emp Id- "+dc.getTestTech());
//    
//    System.out.println("Emp Id- "+se.getEmpId());
//    System.out.println("Emp Name- "+se.getEmpName());
//    System.out.println("Emp Id- "+se.getDevProfile());
//    System.out.println("Emp Id- "+se.getLang());
    

	}

}
