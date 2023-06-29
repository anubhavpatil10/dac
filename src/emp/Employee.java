package emp;

import java.io.Serializable;
import java.time.LocalDate;
//import java.util.Map;

public class Employee implements Serializable{
   
	   public void setId(String id) {
		this.id = id;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public void setDep(Department dep) {
		this.dep = dep;
	}


	public void setJoiningdate(LocalDate joiningdate) {
		this.joiningdate = joiningdate;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}


	private String id;
	   private String Firstname;
	   private String Lastname;
	   private Department dep;
	   private LocalDate joiningdate;
	   private double Salary;
	   
	public Employee(String id, String firstname, String lastname, Department dep, LocalDate joiningdate, double salary) {
		super();
		this.id = id;
		Firstname = firstname;
		Lastname = lastname;
		this.dep = dep;
		this.joiningdate = joiningdate;
		Salary = salary;
	}


	public String getId() {
		return id;
	}


	public String getFirstname() {
		return Firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public Department getDep() {
		return dep;
	}


	public LocalDate getJoinigdate() {
		return joiningdate;
	}


	public double getSalary() {
		return Salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", dep=" + dep
				+ ", joinigdate=" + joiningdate + ", Salary=" + Salary + "]";
	}


	
}
