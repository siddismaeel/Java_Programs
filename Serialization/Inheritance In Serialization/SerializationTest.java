import java.io.*;

public class SerializationTest
{
	public static void main(String[] args)
	{
		Employee emp = new Employee(101, "Ismaeel", "Computer Science", "Indian");
		
		System.out.println("Before serialization");
		System.out.println("Employee Id : " + emp.getEmployeeId()); 
		System.out.println("Employee Name : " + emp.getName()); 
		System.out.println("Department : " + emp.getDepartment()); 
		System.out.println("Nationality : " + emp.getNationality()); 
		
		try
		{
			FileOutputStream fOut = new FileOutputStream("Employee.ser");
			ObjectOutputStream oOut = new ObjectOutputStream(fOut);
			
			System.out.println("-------Serializing-------------"); 
			
			oOut.writeObject(emp);
		}
		catch(IOException i)
		{
			i.printStackTrace(); 
		}
		
		System.out.println("-------Deserializing-------------");
		
		emp =null;
		
		try
		{
			FileInputStream fIn = new FileInputStream("Employee.ser");
			ObjectInputStream oIn = new ObjectInputStream(fIn);
			
			emp = (Employee) oIn.readObject();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
		System.out.println("Before serialization");
		System.out.println("Employee Id : " + emp.getEmployeeId()); 
		System.out.println("Employee Name : " + emp.getName()); 
		System.out.println("Department : " + emp.getDepartment()); 
		System.out.println("Nationality : " + emp.getNationality());
		
	}
}