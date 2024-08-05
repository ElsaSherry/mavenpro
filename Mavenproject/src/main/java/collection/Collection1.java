package collection;

import java.util.ArrayList;

public class Collection1 
{

	public static void main(String[] args)
	{
	ArrayList<Integer> obj=new ArrayList<Integer>();
	obj.add(20);
	obj.add(30);
	obj.add(40);
	obj.add(50);
	
	System.out.println(obj);
	obj.remove(3);
	System.out.println(obj);
	int a=obj.size();
	System.out.println(a);
	System.out.println(obj.contains(40));
	System.out.println(obj.get(2));
	obj.remove(obj);
	System.out.println(obj);
	}

}