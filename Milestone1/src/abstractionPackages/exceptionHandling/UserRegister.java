package abstractionPackages.exceptionHandling;


class InvalidCountryException extends Exception
{
     InvalidCountryException()
	{
		System.out.println("invalid");
	}
     InvalidCountryException(String s)
     {
    	 System.out.println(s);
     }
}
public class UserRegister {
	void registerUser(String uname,String ucountry) throws InvalidCountryException
	{
		if(!ucountry.equals("India"))
		{
			throw new InvalidCountryException("User outside India cannot be registered");
		}
		else
		{
			System.out.println("User regristration done sucessfully");
		}
	}
	public static void main(String args[])
	{
		UserRegister ur=new UserRegister();
		try
		{
			ur.registerUser("keerthi","Asia");
		}
		catch(InvalidCountryException e)
		{
			System.out.println(e);
		}
	}
}
