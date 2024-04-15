package inheritance;

public class Child21 extends Parent2
{
public void sub(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
	public static void main(String[] args)
	{
	Parent2 obj1 =new Parent2();
	obj1.add();
	Parent2.display();
	Child21 obj2=new Child21();
	obj2.add();
	obj2.sub(34, 021);
	
	

	}

}
