package com.deloitte;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Prod_Sell {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration()
				.configure()
				.addAnnotatedClass(Productt.class)
				.addAnnotatedClass(Seller.class)
				.buildSessionFactory();
	Seller sellr= new Seller(501,"ABC",201536);
//		Seller sellr2= new Seller(500,"XYZ",201544);
	//	Productt prod = new Productt(101,"Mobile",50000,sellr);
//		List<Seller> sellerList=Arrays.asList(sellr,sellr2)
		Productt prod = new Productt(101,"Mobile",50000,sellr);
	//	sellr.set(prod);
//		prod.getSellr().add(sellr);
//		prod.getSellr().add(sellr2);
		         Session ssn=sf.openSession();
		         Transaction tx= ssn.beginTransaction();
		     //    ssn.save(sellr);
		      //   ssn.save(prod);
		         tx.commit();
		         ssn.close();
		         
		         
		         

	}

}
