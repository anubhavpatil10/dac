package com.app.tester;

import static com.app.utils.Validation.validateAll;

import java.util.Map;
import java.util.Scanner;

import com.app.patient.Patient;
import com.app.utils.IOUtils;

public class Tester2 {
	
	public static void main(String[] args) {
		try(Scanner sc= new Scanner(System.in)){
			System.out.println("Enter file name");
			String filename= sc.next();			
			Map<Integer, Patient>map= IOUtils.restoreAll(filename);
			
			boolean exit=false;
			
			while (!exit){
				try {
					
					System.out.println("1. Regsiter ");
					System.out.println("2. Display ");
					System.out.println("3. Remove patient with diabities");
					System.out.println("4. Change room type from ICU to Special");
					System.out.println("5. Sort on gender");
					
					switch (sc.nextInt()) {
					
					case 1:
						System.out.println("Accept Details");
						System.out.println("SerialNo, NAme, gender, age date room phno disease ");
						Patient p = validateAll(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.next(), sc.next(), map);
						map.put(p.getSerialNo(), p);
						System.out.println("Added Successfully");
						
						
						break;

					case 2:
						System.out.println("Display All");
						map.values().forEach(System.out::println);
					break;
					
					case 3:
						System.out.println("Enter disese to remove patients");
						String disease=sc.next();
					map.values().removeIf(a->a.getDisease().equals(disease));
//						
//						for(Patient p1: map.values())
//						{
//							if(p1.getDisease().equals(disease))
//								map.remove(p1.getSerialNo());
//						}
						break;
					case 6:
						exit=true;
						break;
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();	
				}
				
				
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		
	}
}
