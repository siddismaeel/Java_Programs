//Program to communicate a generic code with non generic code
//author: Ismaeel Siddiqui

import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Raj");
		al.add("Ram");
		al.add("Raju");
		/*al.add(10); error: incompatible types: int cannot be converted to String
                al.add(10);*/
		
		m1(al);
		
		System.out.println(al);
	}
	
	static void m1(ArrayList al1)
	{
		al1.add("Mohan");
		al1.add(101);
	}
}