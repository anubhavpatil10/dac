package emp;
import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
public class EmployeeValidations {
public static Employee ValidInput(String id,String firstname,String lastname,String dep,String joiningdate,double sal,
		Map<String,Employee> List) throws EmployeeException {
	LocalDate d= Joiningdate(joiningdate);
	Department dp=dep(dep);
	return new Employee(id,firstname,lastname,dp,d,sal);
	
}
public static LocalDate Joiningdate(String joiningdate) throws EmployeeException{
	LocalDate dt=LocalDate.parse(joiningdate.toUpperCase());
	int years=Period.between(dt,LocalDate.now()).getYears();
	if(years>3) {
		throw new EmployeeException("Invalid Joining date");
		
	}return dt;
	
}
public static Department dep(String dp) {
	return Department.valueOf(dp);
}
public static String Checkforduplicate(String id,Map<String,Employee> List) throws EmployeeException{
	if(List.containsKey(id)) {
		throw new EmployeeException("Duplicate Present");
	}
	return id;
}
}
