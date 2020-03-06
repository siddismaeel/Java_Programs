import java.io.*;

public class Deserialization
{
	public static void main(String[] args)
	{
		Employee emp = null;
		FileInputStream fIn = null;
		ObjectInputStream oIn = null;
		
		boolean flag = false;
		try
		{
			fIn = new FileInputStream("Employee.txt");
			oIn = new ObjectInputStream(fIn);
			
			emp = (Employee) oIn.readObject();
			oIn.close();
			fIn.close();
			flag = true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		if(flag)
		{
			System.out.println("Employee Id--"+emp.getEmployeeId());
			System.out.println("Employee Name--"+emp.getEmployeeName());
			System.out.println("Employee Department--"+emp.getDepartment());
		}
		else
		{
			System.out.println("Object : Employee not serialized");
		}
		
	}
}