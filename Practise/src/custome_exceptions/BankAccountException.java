package custome_exceptions;

@SuppressWarnings("serial")
public class BankAccountException extends Exception{
	
	public BankAccountException(String errmsg)
	{
		super(errmsg);
	}

}
