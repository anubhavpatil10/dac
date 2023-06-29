package emp;
import static emp.Ioutils.*;
import static emp.EmployeeValidations.*;

import java.util.Map;
import java.util.Scanner;
public class testeremp {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter FileName");
			String filename = sc.nextLine();
			Map<String, Employee> list = restoreEmpdetails(filename);
			System.out.println("Restored EmpData"+list);
			boolean exit=false;
			while(!exit) {
				System.out.println("Options 1. Hire Employee 2. Display all Employee 3. Promote Employee \" \r\n"
						+ "+ \"4.Delete Employee 5.Sort Emp as per Joining date 0.Exit");
				System.out.println("Enter Choice");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter Employee Details");
						Employee emp = ValidInput(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),list);
						list.put(emp.getId(),emp);
						System.out.println("Succesfully added");
						break;
					case 2:
						System.out.println("Employee Details");
						list.forEach((k,v) -> System.out.println(k+" "+v));
						break;
					case 3:
						System.out.println("Enter Emp ID for Promotion");
						String s = sc.next();
						System.out.println("Enter department name: ");
						String d=sc.next();
						Department dept=Department.valueOf(d.toUpperCase());
						for(Employee e:list.values()) {
						 if(e.getId().contains(s)) {
							 e.setDep(dept);
							 System.out.println("Promoted Emp : "+e);
						 }
						}
						break;
					case 4:
						System.out.println("Sort as per Date");
						list.values().stream()
						.sorted((e1,e2) -> e1.getJoinigdate().compareTo(e2.getJoinigdate()))
				        .forEach(e -> System.out.println(e));
						break;
						
						
					case 0:
						exit=true;
						StoreEmpdetails(filename,list);
					
						break;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
