package polymorphisem;

public class Clothes
{
double dis=0.0;
double price=4000;
public void discount()
{
	double newprice=price+(price*dis/100);
	System.out.println("Season price "+newprice);
	
}

}
