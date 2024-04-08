package exception;

public class Exception3
{
static int a=22;
static int b=0;
	public static void main(String[] args) 
	{
		try
		{
			int div=a/b;
		}
		catch(Exception ae)
		{
			int d=11;
			int e=22;
		int	f=d+e;
			System.out.println(f);
			System.out.println(" catch worked");
		}
finally
{
	System.out.println("hello ");
}
		System.out.println("hello Excception");
	}

}
