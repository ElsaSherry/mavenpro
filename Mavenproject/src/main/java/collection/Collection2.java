package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Collection2 
{

	public static void main(String[] args)
	{
		List<String> obj = new ArrayList<String>();
		obj.add("elsa");
		obj.add("Veda");
		obj.add("Ganga");
		System.out.println(obj);
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		for (String name : obj) 
		
		{
			System.out.println(name);
		}
		
	}

}
