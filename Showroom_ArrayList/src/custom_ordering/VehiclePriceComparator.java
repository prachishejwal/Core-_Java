package custom_ordering;

import java.util.Comparator;
import com.app.core.*;

public class VehiclePriceComparator implements Comparator<Vehicle> {

	public int compare(Vehicle v1,Vehicle v2)
	{
		System.out.println("Inside Compare:price");
		if(v1.getNetPrice()>v2.getNetPrice())
			return -1;
		if(v1.getNetPrice()==v2.getNetPrice())
			return 0;
		return 1;
	}
}
