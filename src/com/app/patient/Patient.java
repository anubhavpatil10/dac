package com.app.patient;

import java.time.LocalDate;

public class Patient {

	private int serialNo;
	private String pName;
	private String gender;
	private int age;
	private LocalDate admitDate;
	private RoomType room;
	private String phNo;
	private String disease;
	
	public Patient() {
	
	}

	public Patient(int serialNo, String pName, String gender, int age, LocalDate admitDate, RoomType room, String phNo,
			String disease) {
		super();
		this.serialNo = serialNo;
		this.pName = pName;
		this.gender = gender;
		this.age = age;
		this.admitDate = admitDate;
		this.room = room;
		this.phNo = phNo;
		this.disease = disease;
	}

	@Override
	public String toString() {
		return "Patient [serialNo=" + serialNo + ", pName=" + pName + ", gender=" + gender + ", age=" + age
				+ ", admitDate=" + admitDate + ", room=" + room + ", phNo=" + phNo + ", disease=" + disease + "]";
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(LocalDate admitDate) {
		this.admitDate = admitDate;
	}

	public RoomType getRoom() {
		return room;
	}

	public void setRoom(RoomType room) {
		this.room = room;
	}

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
	
	
}
