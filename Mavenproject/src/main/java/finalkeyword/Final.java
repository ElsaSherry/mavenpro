package finalkeyword;

public class Final 
{
	final int data=55;
/*	public Final()
	{
		data=30;
	}*/
public void display()
{
	System.out.println(data);
}
	public static void main(String[] args)
	{
		Final obj=new Final();
		obj.display();
		obj.add();

	}
public final void add()
{
int a=12;
int b=22;
int c=a+b;
System.out.println(c);
}
}
