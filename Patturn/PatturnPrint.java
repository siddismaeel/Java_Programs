class PatturnPrint
{
	
	public void patturn1()
	{
		
		int n = 10;
		System.out.println("Patturn : 1");
		for(int i = 0; i<=n; i++)
		{
			for(int j=0; j<i;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	public void patturn2()
	{
		int n = 10;
		
		System.out.println("Patturn : 2");
		for(int i = 0;i<=10;i++)
		{
			for(int j = i; j<= n; j++)
				System.out.print("*");
			System.out.println();
			
		}
	}
	
	public void patturn3()
	{
		System.out.println("Patturn : 3");
		int n = 10;
		
		for(int i = 0; i<=n; i++)
		{
			for(int j= i; j<=n;j++)
				System.out.print(" ");
			
			for(int k = 0; k<=i;k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
	
	public void patturn4()
	{
		int n =10;
		System.out.println("Patturn : 4");
		
		 for(int i = 0; i<= n;i++)
		 {
			 for(int j = i; j<=n;j++)
				 System.out.print(" ");
			 
			 for(int k = 0; k<= i+i; k++)
				 System.out.print("*");
			
			System.out.println();
			
			
			
		 }  
		// patturn4();
	}
	
	public void patturn5()
	{
		int n =10;
		System.out.println("Patturn : 5");
		
		patturn4();
		
		for(int i = 0; i<= n; i++)
		{
			for(int j= 0; j<=i; j++)
				System.out.print(" ");
			
			for(int k = i ; k<= n+n ; k++)
				System.out.print("*");
				
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		PatturnPrint p = new PatturnPrint();
		p.patturn1();
		p.patturn2();
		p.patturn3();
		p.patturn4();
		p.patturn5();
	}
}