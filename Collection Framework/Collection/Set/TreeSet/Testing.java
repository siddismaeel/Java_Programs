// Program to implement inner interface
//Author Ismaeel Siddiqui

import java.util.*;
class Test
{
	interface Yes
	{
		void show();
	}
}

class Testing implements Test.Yes
{
	public void show()
	{
		System.out.println("show method of interface");
	}
	public static void main(String[] args)
	{
		Test test = new Test();
		Test.Yes obj = new Testing();
		obj.show();
	}
}
