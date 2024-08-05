package utilities;

import java.io.IOException;

public class ExcelMain
{

	public static void main(String[] args)throws IOException
	{
		
		System.out.println(Excelcode.getIntegerData(0, 1));
		System.out.println(Excelcode.getStringData(0, 0));
		
		System.out.println(Excelcode.getIntegerData(1, 1));
		System.out.println(Excelcode.getStringData(1, 0));
		
		System.out.println(Excelcode.getIntegerData(2,1));
		System.out.println(Excelcode.getStringData(2, 0));

	}

}
