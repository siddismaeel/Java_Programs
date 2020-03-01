//Program to demonstrate how to create our own generic class
//author: Ismaeel Siddiqui

import java.util.*;

class Store<T>
{
	T ref;
	
	void set(T ref)
	{
		this.ref = ref;
	}
	
	T get()
	{
		return ref;
	}
}

class GenericTest
{
	public static void main(String[] args)
	{
		Store<Integer> roll = new Store<Integer>();
		Store<String> name = new Store<String>();
		
		roll.set(101);
		name.set("ismaeel");
		
		System.out.println(roll.get());
		System.out.println(name.get());
	}
}