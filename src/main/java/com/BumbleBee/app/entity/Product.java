package com.BumbleBee.app.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long pId;
	@Column(name = "product_name", nullable = false)
	private String pName;
	@Column(name = "price")
	private long price;
	@Column(name = "category")
	private String pCat;
	@Column(name = "description")
	private String pDes;
	
	public Product() {
		
	}
	
	public Product(String pName, long price, String pCat, String pDes) {
		super();
		this.pName = pName;
		this.price = price;
		this.pCat = pCat;
		this.pDes = pDes;
	}
	public long getpId() {
		return pId;
	}
	public void setpId(long pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getpCat() {
		return pCat;
	}
	public void setpCat(String pCat) {
		this.pCat = pCat;
	}
	public String getpDes() {
		return pDes;
	}
	public void setpDes(String pDes) {
		this.pDes = pDes;
	}
	
	
	
}
