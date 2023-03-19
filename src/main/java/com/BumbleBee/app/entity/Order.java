package com.BumbleBee.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Orders")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long oId;
	@Column(name = "customer_name", nullable = false)
	private long cId;
	@Column(name = "Order_price")
	private long oPrice;
	@Column(name = "NoOfInstallments")
	private long noOfInstallments;
	@Column(name = "Remainder")
	private long Remainder;
	
public Order() {
		
	}
	
	
	public Order(long cId, long oPrice, long noOfInstallments, long remainder) {
		super();
		this.cId = cId;
		this.oPrice = oPrice;
		this.noOfInstallments = noOfInstallments;
		Remainder = remainder;
	}
	public long getoId() {
		return oId;
	}
	public void setoId(long oId) {
		this.oId = oId;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public long getoPrice() {
		return oPrice;
	}
	public void setoPrice(long oPrice) {
		this.oPrice = oPrice;
	}
	public long getNoOfInstallments() {
		return noOfInstallments;
	}
	public void setNoOfInstallments(long noOfInstallments) {
		this.noOfInstallments = noOfInstallments;
	}
	public long getRemainder() {
		return Remainder;
	}
	public void setRemainder(long remainder) {
		Remainder = remainder;
	}
	
	 
}
