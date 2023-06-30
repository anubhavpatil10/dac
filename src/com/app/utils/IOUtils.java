package com.app.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.app.patient.Patient;

public class IOUtils {

	public static void storeAll(Map<Integer, Patient> maps, String filename) throws FileNotFoundException, IOException
	{
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))){
			
			out.writeObject(maps);
		} 
	}

	public static Map<Integer, Patient> restoreAll(String filename) throws FileNotFoundException, IOException, ClassNotFoundException
	{
		try(ObjectInputStream in =new ObjectInputStream(new FileInputStream(filename)))
		{
		return (Map<Integer, Patient>)in.readObject();
		}
		catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		return new HashMap<>();
	}
}
