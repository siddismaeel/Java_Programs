class Test
{
	static <T> void m1(T... t)
	{
		T[] t2 = t;
		for(T t3 : t2)
			System.out.println(t3);
	}
}

public class TestMain
{
	public static void main(String[] args)
	{
		Test.m1(new Integer(124));
		Test.m1(new Double(10.5));
		Test.m1(55.4, "Ismaeel");
		Test.m1("Ismaeel", " " , "Siddiqui"," ", new Object());
	}
}