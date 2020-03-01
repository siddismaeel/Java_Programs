//Program to demonstrate wild card unknown argument type in generic
//author: Ismaeel Siddiqui

import java.util.*;

class Test
{
	static void element(ArrayList<?> a)
	{
		for(Object e: a)
			System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(200);
		al.add(300);
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Rakesh");
		al1.add("Mohan");
		
		element(al);
		element(al1);
	}
}