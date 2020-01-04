package com.deloitte;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("unused")
@Entity
public class Productt {
	@Id
	int prodId;
	String prodName;
	float price;
	@OneToOne
	Seller sellr;
	@OneToMany
	private List<Seller> sellers= new ArrayList<>();
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Seller getSellr() {
		return sellr;
	
	}
	public void setSellr(Seller sellr) {
		this.sellr = sellr;	}
	
	public Productt() {

	}
	public Productt(int prodId, String prodName, float price, Seller sellr) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.sellr = sellr;
	}
	@Override
	public String toString() {
		return "Productt [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + " seller=" + sellr + "]";
	}
    
	
}
