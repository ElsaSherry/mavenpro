package exception;

public class ThrowEx2 
{
public static void add(int a,int b)
{
	int c=a+b;
	if(c<10)
	{
		throw new ArithmeticException ("not less thn 10");
		
	}
	else
	{
		System.out.println("Less than 10");
	}
}

	public static void main(String[] args)
	{
	try 
	{
       ThrowEx2.add(02, 06);
       System.out.println("Remaining");
	}
	catch (Exception e)
	{
		System.out.println(e);
		System.out.println("hello");
	}
	}
}
