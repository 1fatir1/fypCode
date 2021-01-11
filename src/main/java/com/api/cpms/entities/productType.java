package com.api.cpms.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class productType {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
       private int pTId;
       private String name;
       private String type;
       
       @ManyToMany(cascade = CascadeType.ALL)
       private List<Product> products;
	   public productType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getpTId() {
		return pTId;
	}
	public void setpTId(int pTId) {
		this.pTId = pTId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	} 
	   
       
       
}
