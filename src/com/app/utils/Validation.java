package com.app.utils;

import java.time.LocalDate;
import java.util.Map;

import com.app.exception.PatientException;
import com.app.patient.Patient;
import com.app.patient.RoomType;

public class Validation {

	public static void checkDups(int serialNo, Map<Integer , Patient> maps) throws PatientException 
	{
		if(maps.containsKey(serialNo)) 
		{
			throw new PatientException("Duplicate Patient Found !!!! ");
		}
		System.out.println("Patient added succesfully");
	}


	public static RoomType checkRoom(String room)
	{
		return RoomType.valueOf(room.toUpperCase());
		
	}
	
	public static LocalDate validDate(String date) throws PatientException
	{
		LocalDate d= LocalDate.parse(date);
		if(!LocalDate.now().equals(d))
		{ 
			throw new PatientException("Invalid Date Entered!! Should be today's date !!");
		}
		return d;
	}
	
	public static Patient validateAll(int serialNo, String pName, String gender, int age, String admitDate, String room, String phNo,
			String disease, Map<Integer, Patient> map) throws PatientException {
		checkDups(serialNo,map);
		RoomType r= checkRoom(room);
		LocalDate d= validDate(admitDate);
			
		return new Patient(serialNo, pName, gender, age, d, r, phNo,disease);
		
	}
	
}
