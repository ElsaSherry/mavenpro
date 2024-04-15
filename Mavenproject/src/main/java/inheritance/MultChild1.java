package inheritance;

public class MultChild1 extends MultParent1
{
public void salarycal()
{
	hra=0.05*basicpay;
	pf=0.20*basicpay;
	totalsalary=basicpay+hra-pf-deduction+bonus;
	System.out.println("Total Salary" +totalsalary);
}
	public static void main(String[] args)
	{
MultChild1 obj=new MultChild1();
obj.salarycal();
System.out.println(obj.hra);
System.out.println(obj.pf);
System.out.println(obj.totalsalary);

	}

}
