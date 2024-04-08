package encapsulation;

public class Parenten1
{
	private int a=0;
	private int b=0;
	int c;
	public void setter(int a,int b)
	{
		this.a=a;
		this.b=b;
		 c=a+b;
		
	System.out.println(c);
	}
	public void getter(int c)
	{
	this.c=c;
	System.out.println(c);
	}
}
