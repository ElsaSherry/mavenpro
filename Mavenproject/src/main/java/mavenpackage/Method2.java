package mavenpackage;

public class Method2 
{
static int x;
static int y;
	public static void main(String[] args)
	{
	int c=Method2.add(20, 30);
	System.out.println(c);
	}
	public static int add(int a,int b)
	{
	x=a;
	y=b;
	int c=a+b;
	return c;
	
	}

}
