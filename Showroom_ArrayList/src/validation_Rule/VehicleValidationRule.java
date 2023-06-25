package validation_Rule;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;

import com.app.core.Colours;
import com.app.core.Vehicle;

import Custom_Exceptions.VehicleHandlingException;

public class VehicleValidationRule {
	//Add a specific method to validate all Inputs
	//tring chasisNo, Colours colour, double netPrice, LocalDate manufactureDate, String company
	public static Vehicle validateAllInput(String chasisNo,String colour,double basePrice,String manufactureDate,String company,List<Vehicle> vehicles)throws VehicleHandlingException 
	{
		checkForDuplicate(chasisNo,vehicles);
		Colours validcolour=parseAndValidateColour(colour);
		double netPrice=basePrice+validcolour.getColourCost();
		 LocalDate validDate=parseAndValidateDate(manufactureDate);
		 return new Vehicle(chasisNo,validcolour,netPrice,validDate,company);
	}
	
	//add a static method  parse n validate Date
	public static LocalDate parseAndValidateDate(String date)throws VehicleHandlingException,DateTimeParseException
	{
		LocalDate d1=LocalDate.parse(date);
		//parsing is done successfully
		//now take the begining of every year
		LocalDate beginYear=LocalDate.of(LocalDate.now().getYear(),1,1);
		if(beginYear.isBefore(d1))
			throw new VehicleHandlingException("Enter the date in current year");
		return d1;
										
	}
	
	
	//add a static method to parse n validate color
	public static Colours parseAndValidateColour(String clr)throws IllegalArgumentException
	{
		return Colours.valueOf(clr.toUpperCase());
	}

	//add a static method forNo dup vehicles should be added in the showroom :
	public static void checkForDuplicate(String chasisNo,List<Vehicle> vehicles)throws VehicleHandlingException
	{
		System.out.println("Inside vehicle contains");
		Vehicle newVehicle=new Vehicle(chasisNo);
		if(vehicles.contains(newVehicle))
			throw new VehicleHandlingException("duplicate found!!!!!!!!");
		System.out.println("No duplicate found");
		
	}
}
