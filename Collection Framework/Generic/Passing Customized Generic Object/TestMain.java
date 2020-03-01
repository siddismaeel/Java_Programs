//program to demonstrate passing customized object to our own generic class
//author: Ismaeel Siddiqui

class Test<T>
{
	T t;
	public Test(T t)
	{
		this.t = t;
	}
	
	public void setT(T t)
	{
		this.t = t;
	}
	
	public T getT()
	{
		return t;
	}
	
}

class A 
{
	int i;
	
	public A(int i)
	{
		this.i = i;
	}
}

public class TestMain
{
	public static void main(String[] args)
	{
		Test<A> t1 = new Test<A>(new A(10));
		Test<A> t2 = new Test<A>(new A(20));
		
		
		System.out.println(t1.getT().i);
		System.out.println(t2.getT().i);
	}
}