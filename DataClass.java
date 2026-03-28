package com.example.test;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DataClass 
{

	@Id
    private int formNo; // Auto-generated form number

	@Column
    private String date; // Form date

	@Column
    private String name; // User's name

	@Column
    private String regNo; // Registration number

	@Column
    private String whatNo; // WhatsApp number

	public int getFormNo() {
		return formNo;
	}

	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getWhatNo() {
		return whatNo;
	}

	public void setWhatNo(String whatNo) {
		this.whatNo = whatNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}

	@Column
    private String emailId; // Email ID

	@Column
    private String course; // Course name

	@Column
    private String trainer; // Trainer name
	
}
