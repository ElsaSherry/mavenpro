package exception;

public class Exception2
{

	public static void main(String[] args)
	{ 
		try
		{
			//int div=100/0;
			
			//String s=null;
			//	System.out.println(s.length());
				int a[]=new int[5];
				a[10]=50;
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
		}

		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
System.out.println("Hello");
		
	}

}
