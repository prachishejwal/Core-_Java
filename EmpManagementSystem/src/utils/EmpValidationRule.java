package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.core.app.Dept;
import com.core.app.Emp;

import custom_exception.EmpCustomException;

public interface EmpValidationRule {

	//joindate should not greater than 3yr
	public static LocalDate parseAndValidateJoinDate(String Date)throws EmpCustomException
	{
		//1.parsing
		LocalDate joinDate=LocalDate.parse(Date);
		//2.validation
		int diffInYears=Period.between(joinDate, LocalDate.now()).getYears();
		if(diffInYears>3)
			throw new EmpCustomException("invalid join Date!!!!!!!!!!!!!!!!!!!");
		return joinDate;
	}
	
	public static Dept parseAndValidateDept(String dname)throws EmpCustomException
	{
		Dept validDname=Dept.valueOf(dname.toUpperCase());
		return validDname;
	}
	
	//check for duplicate empid
	static String checkForDup(String empId,Map<String,Emp> emps)throws EmpCustomException
	{
		if(emps.containsKey(empId))
			throw new EmpCustomException("dup emp id   !!!!!!!!!!!!");
		return empId;
	}
	
	
	
	
}
