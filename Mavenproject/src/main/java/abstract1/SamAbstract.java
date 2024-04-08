package abstract1;

public class SamAbstract extends SamAbstract1
{
int a=10;
int b=40;
	@Override
	public void display() 
	{
	int c=a+b;
	System.out.println(c);
		
	}
public static void maim(String args[])
{
	SamAbstract obj=new SamAbstract();
	obj.add();
	obj.display();
	
	
}
}
