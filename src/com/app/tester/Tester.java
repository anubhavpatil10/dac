package com.app.tester;

import static com.app.utils.Validation.validateAll;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;


import com.app.patient.Patient;
import com.app.patient.RoomType;
import com.app.utils.IOUtils;

public class Tester {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the file name");
			Map<Integer, Patient> map = IOUtils.restoreAll(sc.next());
			System.out.println("File Restored Successfully");

			boolean exit = false;
			while (!exit) {
				try {

					System.out.println("1. Accept Details");
					System.out.println("2. Display All");
					System.out.println("3. Remove patient with diabities");
					System.out.println("4. Change room type from icu to special");
					System.out.println("5. Sort patients on basis of gender");

					switch (sc.nextInt()) {

					case 1:// Accept all details
						System.out.println("Accept all details");
						System.out.println("SerialNo, NAme, gender, age date room phno disease ");
						Patient p = validateAll(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.next(), sc.next(), map);
						map.put(p.getSerialNo(), p);
						System.out.println("Added Successfully");
						break;
					case 2:// display
						
						System.out.println("Display all");
						map.values().forEach(System.out::println);
						break;

					case 3:// remove diabities
						System.out.println("remove the patient");
						System.out.println("Enter disease");
						String dis=sc.next();
//						map.values().removeIf(a->a.getDisease().equals(dis));
						break;
					
					case 4: // change room type
						System.out.println("enter room type");
						RoomType taken=RoomType.valueOf(sc.next());
						
						for(Patient p1:map.values())
						{
							if(p1.getRoom().equals(taken))
								map.get(p1.getSerialNo()).setRoom(RoomType.SPECIAL);								
						}
					}

				}
				catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				
				}
			}
		}
	}
}
