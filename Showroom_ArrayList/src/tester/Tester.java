package tester;
import static validation_Rule.ShowroomUtils.populateShowroom;
import static validation_Rule.VehicleValidationRule.*;

import com.app.core.Vehicle;
import com.app.core.Colours;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Custom_Exceptions.VehicleHandlingException;
import custom_ordering.VehiclePriceComparator;


public class Tester {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init phase
			// create empty AL : to store vehicle refs
			List<Vehicle> showroom = populateShowroom();// size=8, init capa=10
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options 1. Add a Vehicle 2. Display all "
						+ "3. Get specific vehicle details 4. Apply discount  "
						+ "5. Delete vehicle details  by ch no 6. Delete vehicles by color "
						+ "7. Sort the vehicles as per ch no " + "8. Sort the vehicles as per price "
						+ "9. Sort the vehicles as per date n price " + "10. Sort the vehicles as per date 0. Exit");
				System.out.println("Choose an option");
				try {
					switch (sc.nextInt()) {
					case 1: // add a new vehicle
						System.out.println(
								"Enter vehicle details : chasisNo,  vehicleColor,  netPrice,  manufactureDate(yr-mon-day),  company");
						Vehicle validVehicle = validateAllInput(sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), showroom);
						showroom.add(validVehicle);
						System.out.println("vehicle added.....");
						break;
					case 2:
						System.out.println("Showroom contents : ");
						for (Vehicle v : showroom)
							System.out.println(v);
						break;
					
						
					case 3:System.out.println("to get a specific vehicle Details");
					System.out.println("Enter the chasisNo");
					Vehicle newVehicle=new Vehicle(sc.next());
					int index=showroom.indexOf(newVehicle);
					if(index==-1)
						throw new VehicleHandlingException("Vehicle not found");
					System.out.println("vehicle found:"+showroom.get(index));
					break;
					
					case 4:System.out.println("Enter the date to add specific discount");
					LocalDate d1=parseAndValidateDate(sc.next());
					Double discount=sc.nextDouble();
					//search by non pk
					for (Vehicle v : showroom)
					{
						if(v.getManufactureDate().isBefore(d1))
							{
								v.setNetPrice(v.getNetPrice() - discount);
							}
							
					
					}
					break;
				   case 5:System.out.println("Enter the chasisNo to delete the vehicle");
				   //The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
				    index = showroom.indexOf(new Vehicle(sc.next()));
				   if(index==-1)
					   throw new VehicleHandlingException("VehicleNotFound");
				   System.out.println("Removed " + showroom.remove(index));
				   break;
				   
				   case 6:System.out.println("Remove the Specific VEhicle by specific colour");
				   Colours clr=parseAndValidateColour(sc.next());
				   Iterator<Vehicle> itr=showroom.iterator();
				   while(itr.hasNext())
					   if(itr.next().getVehicleColor()==clr)
						   itr.remove();
				   break;
				   
				   case 7:// Collections : public static void sort(List<T> list)
					   Collections.sort(showroom);
					   break;
				   
				   case 8:// API of Collections class : public static void sort(List<T> list,Comparator<T>
						// comparator)
					   Collections.sort(showroom,new VehiclePriceComparator());
					}
					
				}
					catch (Exception e)
					{
						e.printStackTrace();
						// read off pending tokens form the scanner's buffer
						sc.nextLine();
					}
			}}}}
			