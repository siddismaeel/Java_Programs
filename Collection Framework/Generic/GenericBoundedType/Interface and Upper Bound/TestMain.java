//Program to demonstrate upper bound generic type argument with interfaces
//author: Ismaeel Siddiqui

import java.io.*;
class Test<T extends Number & Comparable & Serializable>
{
	T t;
	
	Test(T t)
	{
		this.t = t;
	}
	
	public T get()
	{
		return t;
	}
}
class TestMain
{
	public static void main(String[] args)
	{
		Test<Integer> t1 = new Test<>(new Integer(124));
		Test<Double> t2 = new Test<>(new Double(5.5));

		System.out.println(t1.get());
		System.out.println(t2.get());
		
		/*Test<String> t3 = new Test<>(new Sring("Ismaeel")); CE:  type argument String is not 		within bounds of type-variable T
		
		Test<Number> t2 = new Test<>(123); Note Number class implements Serializable but not 			Comparable so there will be the same error as above

		*/
	}
}