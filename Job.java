package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Job {
 @Id
 private int Sl_no;
 private String Name_of_Job;
 private String Vacance;
 private String Qualification;
 private String Full_or_part_time;
 private String Address;
public Job(int sl_no, String name_of_Job, String type_of_Job, String vacance, String qualification,
		String full_or_part_time, String address) {
	super();
	Sl_no = sl_no;
	Name_of_Job = name_of_Job;
	Vacance = vacance;
	Qualification = qualification;
	Full_or_part_time = full_or_part_time;
	Address = address;
}
public Job() {
	super();
	// TODO Auto-generated constructor stub
}
public int getSl_no() {
	return Sl_no;
}
public void setSl_no(int sl_no) {
	Sl_no = sl_no;
}
public String getName_of_Job() {
	return Name_of_Job;
}
public void setName_of_Job(String name_of_Job) {
	Name_of_Job = name_of_Job;
}

public String getVacance() {
	return Vacance;
}
public void setVacance(String vacance) {
	Vacance = vacance;
}
public String getQualification() {
	return Qualification;
}
public void setQualification(String qualification) {
	Qualification = qualification;
}
public String getFull_or_part_time() {
	return Full_or_part_time;
}
public void setFull_or_part_time(String full_or_part_time) {
	Full_or_part_time = full_or_part_time;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
 
}
