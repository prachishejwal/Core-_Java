package custom_exception;
//checked Exception thats why Super class is Exception
public class EmpCustomException extends Exception {
 
	
	public EmpCustomException(String msg)
	{
		super(msg);
	}
	
}
