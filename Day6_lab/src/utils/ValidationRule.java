package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.app.core.Customer;
import com.app.core.Services;

import Custom_Exception.CustomerHnadlingException;

public class ValidationRule {
	
	//Add a static method method to invoke all validation rule
	public static Customer ValidateAllInputs(String firstName,String lastName,String email, String password,
			double registrationAmount, String dob, String plan,List<Customer> customerList)throws CustomerHnadlingException
	{
		CheckForDuplicate(customerList,email);
		Services servicePlan=parseAndValidatePlanAndRegAmount(plan,registrationAmount);
		LocalDate validDob=validateDob(dob);
		return new Customer(firstName,lastName,email,password,registrationAmount,validDob,servicePlan);
	}
	
	
//ADD A STATIC METHOD TO CHECK FOR DUPLICATION
	public static void CheckForDuplicate(List<Customer> customerlist,String newEmail)throws  CustomerHnadlingException
	{
		//Wrap email in customer ref
		Customer newCustomer=new Customer(newEmail);
		if(customerlist.contains(newCustomer))//refer memory diagram
			throw new CustomerHnadlingException("Duplicate emailid,choose new email!!!!!!!!!!!");
		System.out.println("no duplicate found");
	}
	
//adda static method for plan parsing n validation
//compiler not foces uncheck exception
	
//	public static Services parseAndValidatePlan(String planName)throws IllegalArgumentException
//	{
//		return Services.valueOf(planName.toUpperCase());
//	}
//	
//	//add a stattic method to valdidate reg amount matching with a plan
//	public static void validateRegistrationAmountForPlan( Double registrationAmount,Services chosenplan)
//	{
//		if(chosenplan.getPlanCost()!=registrationAmount)
//			throws new CustomerHnadlingException("Invalid reg amount for chosen plan");
//	}
	
	public static Services parseAndValidatePlanAndRegAmount(String PlanName,double registrationAmount)throws IllegalArgumentException,CustomerHnadlingException

	{
		Services plan=Services.valueOf(PlanName.toUpperCase());
		if(plan.getPlanCost ()!= registrationAmount)
				throw new CustomerHnadlingException("Invalid reg amount for chosen plan");
	return plan;
	}
	
	public static LocalDate validateDob(String dob)throws CustomerHnadlingException
	{
		LocalDate date=LocalDate.parse(dob);
		int ageInYears=Period.between(date, LocalDate.now()).getYears();
		if(ageInYears>21)
			return date;
		throw new CustomerHnadlingException("Invalid Date");
		
		
	}
	
//	//add a static method for login
//	public static Customer customerlogin(String email,string pass,List<Customer> customerList)
//	{
//		
//		//search by email:pk
//		int index=customerList.indexOf(new Customer(email));//wrap in customer object proper checking
//		//invalid
//		if(index == -1)
//			throw new CustomerHnadlingException("Invalid Email");
//		Customer validCustomer=customerList.get(index);
//		if(!validCustomer.getPassword().equals(pass))
//			throw new CustomerHnadlingException("unsuccesful login");
//	}
	
}

//string to enum===valueOf

//java.time.period===>parse