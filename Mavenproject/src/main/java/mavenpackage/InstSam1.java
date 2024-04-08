package mavenpackage;

public class InstSam1 
{
	int c;
	public int add(int a,int b)
	{
	c=a+b;
	System.out.println("Hello Instance");
	System.out.println(c);
	return c;
	}

	public static void main(String[] args)
	{

     InstSam1 obj=new InstSam1();
     obj.add(10, 20);
     System.out.println(obj.c);
     System.out.println(obj.add(20, 32));
     
	}

}
