package polymorphisem;

public class Onseason extends Clothes
{
	
		double dis=40;
		double newprice2;
		public void discount()
		{
			super.discount();
			 newprice2=price-(price*dis/100);
			System.out.println("On season Price is "+newprice2);
		}
			public static void main(String[] args)
		{
				
				Onseason obj= new Onseason();
				obj.discount();

		}


}
