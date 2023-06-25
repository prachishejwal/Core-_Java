package Custom_Exceptions;

//Exception​(String message)
@SuppressWarnings("serial")
public class VehicleHandlingException extends Exception{

	public VehicleHandlingException(String errormsg)
	{
		super(errormsg);
	}
}
