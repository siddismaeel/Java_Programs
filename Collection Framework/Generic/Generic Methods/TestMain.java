import java.util.*;

class Test
{
	static <T> void m1(T t)
	{
		T t2 = t;
		
		System.out.println(t2);
	}
}

class TestMain
{
	public static void main(String[] args)
	{
		Test.m1(new Integer(124));
		Test.m1(new Double(10.5));
		Test.m1(55.4);
		Test.m1("Ismaeel");
	}
}