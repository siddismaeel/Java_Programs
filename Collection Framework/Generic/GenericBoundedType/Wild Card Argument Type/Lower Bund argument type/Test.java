//program to demostrate generic wild card lower bound 
//author: Ismaeel Siddiqui

import java.util.*;

class Test
{
	static void element(ArrayList<? super Integer > a)
	{
		for(Object e: a)
			System.out.println(e);
	}
	
	public static void main(String[] args)
	{
		ArrayList<Number> al = new ArrayList<>();
		al.add(10.5);
		al.add(11.5);
		
		ArrayList<Double> al1 = new ArrayList<>();
		
		
		ArrayList<Integer> al2 = new ArrayList<>();
		al2.add(10);//allowed
		 
		element(al);
		
		/*element(al1); error: incompatible types: ArrayList<Double> cannot be converted to ArrayList<? super Integer>
         element(al1);*/
		 
		element(al2);
	}
}