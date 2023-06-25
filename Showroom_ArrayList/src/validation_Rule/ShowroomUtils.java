package validation_Rule;

import java.util.ArrayList;
import java.util.List;
import com.app.core.Vehicle;
import Custom_Exceptions.VehicleHandlingException;


import static validation_Rule.VehicleValidationRule.validateAllInput;

@SuppressWarnings("unused")
public class ShowroomUtils 
{
	//Add a static method to return populated list(sample hardcoded data) of vehicles
	

	public static List<Vehicle> populateShowroom() {
	{
	try
	{
	ArrayList<Vehicle> vehicles=new ArrayList<>();
	vehicles.add(validateAllInput("abc-1230", "white", 445678, "2023-03-14", "Honda", vehicles));
	vehicles.add(validateAllInput("abc-1230", "white", 445678, "2023-03-14", "Honda", vehicles));
	vehicles.add(validateAllInput("abc-1233", "white", 375678, "2023-02-18", "Honda", vehicles));
	vehicles.add(validateAllInput("abc-1238", "red", 315678, "2023-03-01", "Maruti", vehicles));
	vehicles.add(validateAllInput("abc-1239", "white", 395678, "2023-02-14", "Honda", vehicles));
	vehicles.add(validateAllInput("abc-1231", "white", 345878, "2023-03-15", "Maruti", vehicles));
	vehicles.add(validateAllInput("abc-1232", "red", 385678, "2023-03-25", "Honda", vehicles));
	vehicles.add(validateAllInput("abc-1240", "black", 305678, "2023-02-14", "Maruti", vehicles));
	return vehicles;
	}
	catch(Exception E)
	{
		E.getStackTrace();
	}
	}
	return null; 
   }
}