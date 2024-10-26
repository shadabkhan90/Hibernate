package com.sha.projecthiber;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;




@Entity
@Table(name = "STUDENT_TABLE")
public class StudentAdress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADDRESS_ID")
	private int addressid;
	
	@Column(length = 50 , name = "STREET")
	private String street;
	
	
	@Column(length = 100,name = "CITY")
	private String city;
	
	
	
	
	private boolean isOpen;
	
	@Transient
	@Column(length = 100 , name = "X")
	private double x;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	

	
	public StudentAdress(int addressid, String street, String city, boolean isOpen, double x, Date addedDate) {
		super();
		this.addressid = addressid;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
	}
	
	
	

	public StudentAdress() {
		super();
		// TODO Auto-generated constructor stub
	}




	public void setaddressid(int addressid ) {
		this.addressid = addressid;
		
	}
	
	public int getaddressid() {
		return addressid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}




	@Override
	public String toString() {
		return "StudentAdress [addressid=" + addressid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + "]";
	}
	
	
	
	

}
