package com.deloitte.estore.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.estore.model.Product;
import com.deloitte.estore.service.ProductService;
import com.deloitte.estore.service.ProductServiceImpl;

public class DeloitteEStoreApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ProductService service=new ProductServiceImpl();
	Product p=new Product(1018,"Desktop",40000);
	try {
		if(service.addProduct(p))
		{
			System.out.println("Product added..");
			
		}
		else
		{
			System.out.println("Not added");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	     p.setProductId(1015);
	try {
		if(service.deleteProduct(p))
		{
			System.out.println("Product deleted..");
			
		}
		else
		{
			System.out.println("Not deleted");
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 p.setProductName("Projector");
	 p.setProductId(1017);
	
		try {
			if(service.updateProduct(p))
			{
				System.out.println("Product updated..");
				
			}
			else
			{
				System.out.println("Not updated");
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		try
		{
			System.out.println("Enter the product id: ");
			int pid= sc.nextInt();
			Product rslt= service.getProductById(pid);
			System.out.println("Product Id: "+rslt.getProductId()+"\nProduct name: "+rslt.getProductName()+"\nProduct price: "+rslt.getPrice());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	 try {
		 List<Product>pList= new ArrayList<>();
		 pList=service.getAllProducts();
		// System.out.print(pList);
		 pList.forEach(System.out::println);
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 
	
	 }
	}

}
