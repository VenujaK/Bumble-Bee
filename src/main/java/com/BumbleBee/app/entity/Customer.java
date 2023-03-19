package com.BumbleBee.app.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cId;
	@Column(name = "customer_name", nullable = false)
	private String cName;
	@Column(name = "customer_age")
	private long cAge;
	@Column(name = "customer_nic")
	private long cNic;
	@Column(name = "customer_address")
	private String cAddress;
	
public Customer() {
		
	}
	
	
	public Customer(String cName, long cAge, long cNic, String cAddress) {
		super();
		this.cName = cName;
		this.cAge = cAge;
		this.cNic = cNic;
		this.cAddress = cAddress;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getcAge() {
		return cAge;
	}
	public void setcAge(long cAge) {
		this.cAge = cAge;
	}
	public long getcNic() {
		return cNic;
	}
	public void setcNic(long cNic) {
		this.cNic = cNic;
	}
	public String getcAddress() {
		return cAddress;
	}
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	
}
