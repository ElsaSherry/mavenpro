package interface1;

public class Inter2 implements InterfaceEx1
{

	public static void main(String[] args)
	{
	Inter2 obj=new Inter2();
	obj.add();
	obj.display();

	}

	@Override
	public void display() {
	int c=10;
	System.out.println(c);
		
	}

	@Override
	public void add()
	{
		int a=10;
		int b=23;
		int d=a+b;
		System.out.println(d);
		
	}

}
