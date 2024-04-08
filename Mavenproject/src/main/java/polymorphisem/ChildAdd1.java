package polymorphisem;

public class ChildAdd1 extends ParentAdd1
{
	
	public void add(int num1,int num2)
	{
		super.add(num1, num2);
		if(num3 % 10==0)
		{
			System.out.println("The result is Divisible by 10");
		}
		else
		{
			System.out.println("The result is not Divisible by 10");
		}
		
	}

	public static void main(String[] args)
	{
		
ChildAdd1 obj = new ChildAdd1();
obj.add(20, 30);
obj.add(45, 60);
	}

}
