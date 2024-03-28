package polymorphisem;

public class Offseason extends Clothes
{
double dis=15;
double newprice1;
public void discount()
{
	super.discount();
	 newprice1=price-(price*dis/100);
	System.out.println("Off season Price is "+newprice1);
}
	public static void main(String[] args)
	{
		
		Offseason obj= new Offseason();
		obj.discount();

	}

}
