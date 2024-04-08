package exception;

public class Exception1
{
static int a=0;
static int b=20;
static int c;
	public static void main(String[] args)
	{
		try 
	{
		 c=b/a;
		System.out.println(c);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
		//ae.printStackTrace();
	}
	System.out.println("Hello");
	
	}
	

	}


