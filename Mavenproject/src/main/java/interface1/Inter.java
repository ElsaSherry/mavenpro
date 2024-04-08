package interface1;

public class Inter implements Interface1,Interface2
{

	public static void main(String[] args)
	{
	Inter obj=new Inter();
	obj.add();
	obj.display();
	obj.sub();
	Interface1 obj2=new Inter();
	obj2.add();
	
	

	}

	@Override
	public void display() 
	{
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void add()
	{
		int d= a-b;
		System.out.println(d);
		
	}

	@Override
	public void sub() 
	{
int e=a*b;
System.out.println(e);
		
	}

}
