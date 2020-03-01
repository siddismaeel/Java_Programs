/*Program for serializaion of the class which has the refference to the object the class whic has either declared as final or it is not Seializable

Author: Ismaeel Siddiqui
*/

import java.io.*; 

 class Employee implements Serializable
{
	int employeeId;
	String employeeName;
	String department;
	transient Address address;
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public void setAddress(Address address)
	{
		this.address = address;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public Address getAddress()
	{
		return address;
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException, ClassNotFoundException
	{	try
		{
			os.defaultWriteObject();
			os.writeInt(address.getHomeNumber());
			os.writeObject(address.getStreet());
			os.writeObject(address.getCity());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void readObject(ObjectInputStream is) throws IOException, ClassNotFoundException
	{	try
		{
			is.defaultReadObject();
			int homeNumber = is.readInt();
			String street = (String) is.readObject();
			String city = (String) is.readObject();
			Address address = new Address(homeNumber, street, city);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
} 

class Address
{
	int homeNumber;
	String street;
	String city;
	
	public Address(int homeNumber, String street, String city)
	{
		this.homeNumber = homeNumber;
		this.street = street;
		this.city = city;
	}
	public Address(){}
	public void setHomeNumber(int homeNumber)
	{
		this.homeNumber = homeNumber;
	}
	
	public void setStreet(String street)
	{
		this.street = street;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public int getHomeNumber()
	{
		return homeNumber;
	}
	
	public String getStreet()
	{
		return street;
	}
	
	public String getCity()
	{
		return city;
	}
	
}

public class SerializationTest
{
	public static void main(String[] args)
	{
		Employee emp = new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("ismaeel");
		emp.setDepartment("Computer");
		
		Address address = new Address();
		address.setHomeNumber(002);
		address.setStreet("beech Gali");
		address.setCity("Jarari");
		
		emp.setAddress(address);
		
		System.out.println("Before Serializing ");
		System.out.println("Employee Id--- "+emp.getEmployeeId());
		System.out.println("Employee Name-- "+emp.getEmployeeName());
		System.out.println("Department--- "+emp.getDepartment());
		System.out.println("Home Number--- "+emp.getAddress().getHomeNumber());
		System.out.println("Street-------- "+emp.getAddress().getStreet());
		System.out.println("City---------- "+emp.getAddress().getCity());
		
		//Serializing 
		
		try
		{
			FileOutputStream fOut = new FileOutputStream("Employee.ser");
			ObjectOutputStream os = new ObjectOutputStream(fOut);
			
			os.writeObject(emp);
			fOut.close();
			os.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//Deserializing
		
		emp = null;
		
		try
		{
			FileInputStream fIn = new FileInputStream("Employee.ser");
			ObjectInputStream is = new ObjectInputStream(fIn);
			
			emp = (Employee) is.readObject();
			fIn.close();
			is.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("After DeSerializing ");
		System.out.println("Employee Id--- "+emp.getEmployeeId());
		System.out.println("Employee Name-- "+emp.getEmployeeName());
		System.out.println("Department--- "+emp.getDepartment());
		System.out.println("Home Number--- "+emp.getAddress().getHomeNumber());
		System.out.println("Street-------- "+emp.getAddress().getStreet());
		System.out.println("City---------- "+emp.getAddress().getCity());
	}
}