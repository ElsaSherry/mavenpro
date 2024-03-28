package mavenpackage;

public class Agreggation2
{
String place;
Aggregation1 ag;
public Agreggation2(String place, Aggregation1 ag)
{
	this.place=place;
	this.ag=ag;
}
public void display()
{
	System.out.println(place);
	System.out.println(ag.id);
	System.out.println(ag.name);
}
	public static void main(String[] args)
	{
		
Aggregation1 obj1=new Aggregation1("Elsa",22);
Agreggation2 obj2 =new Agreggation2("tvm",obj1);
obj2.display();

	}

}
