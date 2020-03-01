//Program for demonstrate Generic wild card upper bound argument type
//author: Ismaeel Siddiqui

import java.util.*;

class Test
{
	public static void element(ArrayList<? extends Number > a)
	{
		for(Object e:a)
			System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(101);
		al.add(102);
		al.add(103);
		
		element(al);
		/*ArrayList<String> al1 = new ArrayList<>();
		
		al1.add("Ismaeel");
		element(al1);*
		
		Error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>
                element(al1);
		
		*/
	}
}

