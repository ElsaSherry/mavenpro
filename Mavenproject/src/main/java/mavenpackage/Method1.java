package mavenpackage;

public class Method1
{
static int a=10;
static int b=40;
	public static void main(String[] args) 
	{
	int c=Method1.add()	;
	System.out.println(c);
	int d=Method1.sub()	;
	System.out.println(d);
	int e=Method1.mult();
	System.out.println(e);
	int f=Method1.div()	;
	System.out.println(f);
	}

	public static int add()
	{
		int c=a+b;
		return c;
	}
	public static int sub()
	{
		int d=b-a;
		return d;
	}
	public static int mult()
	{
		int e=a*b;
		return e;
	}
	public static int div()
	{
		int f=b/a;
		return f;
	}
}
