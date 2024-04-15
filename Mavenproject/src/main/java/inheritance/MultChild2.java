package inheritance;

public class MultChild2 extends MultChild1
{
	public void salaryslip()
	{
		System.out.println("/n generate salary slip");
		System.out.println("Basic pay "+basicpay);
		System.out.println("Deduction"+deduction);
		System.out.println("HRA "+hra);
		System.out.println("PF "+pf);
		System.out.println("Bonus "+bonus);

	}

	public static void main(String[] args)
	{
MultChild2 obj=new MultChild2();
obj.employeedetails();
obj.salarycal();
obj.salaryslip();
obj.employeedetails();

	}

}
