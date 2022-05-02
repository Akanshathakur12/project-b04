package com.training.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Seller")
public class Seller {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long s_id;
	private String s_firstname;
	private String s_lastname;
	private String s_password;
	private int s_age;
	private String s_gender;
	private String s_mobileNumber;
	private String s_email;
	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seller(Long s_id, String s_firstname, String s_lastname, String s_password, int s_age, String s_gender,
			String s_mobileNumber, String s_email) {
		super();
		this.s_id = s_id;
		this.s_firstname = s_firstname;
		this.s_lastname = s_lastname;
		this.s_password = s_password;
		this.s_age = s_age;
		this.s_gender = s_gender;
		this.s_mobileNumber = s_mobileNumber;
		this.s_email = s_email;
	}
	public Long getS_id() {
		return s_id;
	}
	public void setS_id(Long s_id) {
		this.s_id = s_id;
	}
	public String getS_firstname() {
		return s_firstname;
	}
	public void setS_firstname(String s_firstname) {
		this.s_firstname = s_firstname;
	}
	public String getS_lastname() {
		return s_lastname;
	}
	public void setS_lastname(String s_lastname) {
		this.s_lastname = s_lastname;
	}
	public String getS_password() {
		return s_password;
	}
	public void setS_password(String s_password) {
		this.s_password = s_password;
	}
	public int getS_age() {
		return s_age;
	}
	public void setS_age(int s_age) {
		this.s_age = s_age;
	}
	public String getS_gender() {
		return s_gender;
	}
	public void setS_gender(String s_gender) {
		this.s_gender = s_gender;
	}
	public String getS_mobileNumber() {
		return s_mobileNumber;
	}
	public void setS_mobileNumber(String s_mobileNumber) {
		this.s_mobileNumber = s_mobileNumber;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	@Override
	public String toString() {
		return "Seller [s_id=" + s_id + ", s_firstname=" + s_firstname + ", s_lastname=" + s_lastname + ", s_password="
				+ s_password + ", s_age=" + s_age + ", s_gender=" + s_gender + ", s_mobileNumber=" + s_mobileNumber
				+ ", s_email=" + s_email + "]";
	}
	
	
	
	
	

}
