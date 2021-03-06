package com.bikerental.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

// uniqueConstraints = {@UniqueConstraint(columnNames = {"Email"})}
@Entity
@Table(name="provider", uniqueConstraints = @UniqueConstraint(columnNames = "provEmail"))
public class Provider {
	@Id
	@GeneratedValue
	long provId;
	//@Column(unique=true)
	String provEmail;
	String provPassword;
	String proveFname;
	String provDateofBirth;
	int provAge;
	String provContoctNo;
	String provAadhar;
	String provRcBookNo;
	String provAddress;
	String provCity;
	String provState;
	String provPin;
	public String getProvEmail() {
		return provEmail;
	}
	public void setProvEmail(String provEmail) {
		this.provEmail = provEmail;
	}
	public String getProvPassword() {
		return provPassword;
	}
	public void setProvPassword(String provPassword) {
		this.provPassword = provPassword;
	}
	public String getProveFname() {
		return proveFname;
	}
	public void setProveFname(String proveFname) {
		this.proveFname = proveFname;
	}
	
	
	public int getProvAge() {
		return provAge;
	}
	public void setProvAge(int provAge) {
		this.provAge = provAge;
	}
	
	public String getProvAadhar() {
		return provAadhar;
	}
	public void setProvAadhar(String provAadhar) {
		this.provAadhar = provAadhar;
	}
	
	public String getProvAddress() {
		return provAddress;
	}
	public void setProvAddress(String provAddress) {
		this.provAddress = provAddress;
	}
	public String getProvCity() {
		return provCity;
	}
	public void setProvCity(String provCity) {
		this.provCity = provCity;
	}
	public String getProvState() {
		return provState;
	}
	public void setProvState(String provState) {
		this.provState = provState;
	}
	
	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getProvId() {
		return provId;
	}
	public void setProvId(long provId) {
		this.provId = provId;
	}
	public String getProvDateofBirth() {
		return provDateofBirth;
	}
	public void setProvDateofBirth(String provDateofBirth) {
		this.provDateofBirth = provDateofBirth;
	}
	public String getProvContoctNo() {
		return provContoctNo;
	}
	public void setProvContoctNo(String provContoctNo) {
		this.provContoctNo = provContoctNo;
	}
	public String getProvRcBookNo() {
		return provRcBookNo;
	}
	public void setProvRcBookNo(String provRcBookNo) {
		this.provRcBookNo = provRcBookNo;
	}
	public String getProvPin() {
		return provPin;
	}
	public void setProvPin(String provPin) {
		this.provPin = provPin;
	}
	public Provider(long provId, String provEmail, String provPassword, String proveFname, String provDateofBirth,
			int provAge, String provContoctNo, String provAadhar, String provRcBookNo, String provAddress,
			String provCity, String provState, String provPin) {
		super();
		this.provId = provId;
		this.provEmail = provEmail;
		this.provPassword = provPassword;
		this.proveFname = proveFname;
		this.provDateofBirth = provDateofBirth;
		this.provAge = provAge;
		this.provContoctNo = provContoctNo;
		this.provAadhar = provAadhar;
		this.provRcBookNo = provRcBookNo;
		this.provAddress = provAddress;
		this.provCity = provCity;
		this.provState = provState;
		this.provPin = provPin;
	}

	
	
	
}
