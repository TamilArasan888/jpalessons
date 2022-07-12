package com.chainsys.jpa.application.doctor;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Doctor")
public class Doctor {
	@Id
	private int doct_id; 
	private String doct_name;    
	private Date dob;                         
	private String speciality; 
	private String city;                   
	private long phone_no;
	@Column(name="standard_fees")
	private float standard_fees;  
	
	public int getDoct_Id() {
		return doct_id;
	}
	public void setDoct_Id(int doct_Id) {
		this.doct_id = doct_Id;
	}
	public String getDoct_Name() {
		return doct_name;
	}
	public void setDoct_Name(String doct_Name) {
		this.doct_name = doct_Name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_No() {
		return phone_no;
	}
	public void setPhone_No(long phone_No) {
		this.phone_no = phone_No;
	}
	public float getStandard_fees() {
		return standard_fees;
	}
	public void setStandard_fees(int standard_fees) {
		this.standard_fees = standard_fees;
	}
	@Override
	public String toString() // Inbuilt method
	{
		return String.format("%d, %s, %s, %s, %d",doct_id,doct_name,dob,city,phone_no);
	}
}
