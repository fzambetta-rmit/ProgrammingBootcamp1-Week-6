package au.edu.rmit.Question2_3;

public class NoGameCharacterFoundException extends Exception 
{
	private static final long serialVersionUID = 3556083643205326553L;
	
	public NoGameCharacterFoundException()
	{
		super();
	}
	
	public NoGameCharacterFoundException(String message)
	{
		super(message);
	}
	
}
