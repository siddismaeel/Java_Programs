//author: Ismaeel Siddiqui

import java.util.*;

class Test<T>
{
	T ob;
	
	Test(T ob)
	{
		this.ob = ob;
	}
	
	public void show()
	{
		System.out.println(ob.getClass().getName() + " of type");
	}
	
	T getObject()
	{
		return ob;
	}
}

class GenericTest
{
	public static void main(String[] args)
	{
		Test<Integer> roll = new Test<Integer>(101);
		Test<String> name = new Test<String>("Ismaeel");
		
		roll.show();
		name.show();
		
		System.out.println(roll.getObject());
		System.out.println(name.getObject());
	}
}