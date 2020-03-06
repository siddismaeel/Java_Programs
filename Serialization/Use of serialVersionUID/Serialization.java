import java.io.*;

public class Serialization
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		FileOutputStream fOut = null;
		ObjectOutputStream oOut = null;
		emp.setEmployeeId(101);
		emp.setEmployeeName("Ismaee");
		emp.setDepartment("Computer");
		try
		{
			fOut = new FileOutputStream("Employee.txt");
			oOut = new ObjectOutputStream(fOut);
			
			oOut.writeObject(emp);
			oOut.close();
			fOut.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
}