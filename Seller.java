package com.deloitte;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seller {
@Id
int sellerId;
String sellerName;
int gstn;
//@OneToOne
//Productt prod;
public int getSellerId() {
	return sellerId;
}
public void setSellerId(int sellerId) {
	this.sellerId = sellerId;
}
public String getSellerName() {
	return sellerName;
}
public void setSellerName(String sellerName) {
	this.sellerName = sellerName;
}
public int getGstn() {
	return gstn;
}
public void setGstn(int gstn) {
	this.gstn = gstn;
}
/*public Productt getProd() {
	return prod;
}
public void setProd(Productt prod) {
	this.prod = prod;
}*/
public Seller() {
	
}
public Seller(int sellerId, String sellerName, int gstn) {
	super();
	this.sellerId = sellerId;
	this.sellerName = sellerName;
	this.gstn = gstn;
	//this.prod = prod;
}
@Override
public String toString() {
	return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", gstn=" + gstn + " ]";
}


}
