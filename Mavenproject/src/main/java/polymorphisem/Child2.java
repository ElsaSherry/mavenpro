package polymorphisem;

public class Child2 extends Parent2
{
	
int d;
public void add()
{
	super.add();
	int d=a-b;
	System.out.println(d);
}
	public static void main(String[] args) 
	{
Child2 obj= new Child2();
obj.add();

	}

}
