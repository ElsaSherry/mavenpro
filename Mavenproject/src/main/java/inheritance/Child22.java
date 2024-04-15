package inheritance;

public class Child22 extends Parent2
{
	public void multiply(int a, int b)
	{
		int c = a * b;
		System.out.println("Second Child class result" + c);
	}

	public static void main(String[] args)
	{

		Child22 obj3 = new Child22();
		obj3.multiply(22, 43);
		obj3.add();
		Parent2 obj1 = new Parent2();
		Parent2.display();
		obj1.add();

	}

}
