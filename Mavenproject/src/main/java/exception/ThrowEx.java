package exception;

public class ThrowEx 
{
public static void vote(int a)
{
	
	if(a<18)
	{
		throw new ArithmeticException ("not eligible");
	}
	else
	{
		System.out.println("ELIGIBLE TO VOTE");
	}
}
	public static void main(String[] args)
	{
	vote(15);

	}

}
