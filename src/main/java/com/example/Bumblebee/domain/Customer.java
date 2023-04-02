package com.example.Bumblebee.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cid;
	
	private String cname;
	
	private String cmail;
	
	private int cnumber;
	
	private String cpassword;
	
	private int age;

	public Customer() {
		
	}
//	@Override
//	public String toString() {
//		return "Customer [cid=" + cid + ", cname=" + cname + ", cmail=" + cmail + ", cnumber=" + cnumber + ", cpassword="
//				+ cpassword + "age=" + age + "]";
//	}

	public Customer(Long cid, String cname, String cmail, int cnumber, String cpassword, int age) {
		
		this.cid = cid;
		this.cname = cname;
		this.cmail = cmail;
		this.cnumber = cnumber;
		this.cpassword = cpassword;
		this.age = age;
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCmail() {
		return cmail;
	}

	public void setCmail(String cmail) {
		this.cmail = cmail;
	}

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
