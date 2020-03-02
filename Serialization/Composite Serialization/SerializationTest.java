/* program for serialization of the class which has the refference to the object of another class

Author: Ismaeel Siddiqui
*/

import java.io.*;

class Employee implements Serializable
{
	private int empId;
	private String empName;
	private Address address;

	public void setId(int empId)
	{
		this.empId = empId;

	}

	public void setEmpName(String  empName)
	{
		this.empName = empName;

	}

	public void setAddress(Address address)
	{
		this.address = address;

	}

	public int getEmpId()
	{

		return empId;
	}

	public String getEmpName()
	{

		return empName;
	}

	public Address getAddress()
	{

		return address;
	}

}

class Address implements Serializable
{
	
	private String city;
	private String state;
	private int zip;
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public void setState(String state)
	{
		this.state = state;
	}
	
	public void setZip(int zip)
	{
		this.zip = zip;
		
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getZip()
	{
		return zip;
	}
	
}

class SerializationTest
{
	public static void main(String[] args)
	{

		Employee emp = new Employee();

		emp.setId(101);
		emp.setEmpName("Ismaeel");

		Address address = new Address();

		address.setCity("Jarari");
		address.setState("UP");
		address.setZip(209739);

		emp.setAddress(address);

		System.out.println("Before serializing..............");

		System.out.println("Employee Id---"+emp.getEmpId());
		System.out.println("Employee Name---"+emp.getEmpName());
		System.out.println("Employee City---"+emp.getAddress().getCity());
		System.out.println("Employee State---"+emp.getAddress().getState());
		System.out.println("Employee Zip---"+emp.getAddress().getZip());

		//Now Serializing
		try
		{
			FileOutputStream fOut = new FileOutputStream("Employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fOut);

			out.writeObject(emp);
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		emp = null;

		//Now Deserializing
		try
		{
			FileInputStream fIn = new FileInputStream("Employee.ser");
			ObjectInputStream in = new ObjectInputStream(fIn);

			emp = (Employee) in.readObject();
		}
		catch(IOException i)
		{
	
			i.printStackTrace();
		}
		catch(ClassNotFoundException c)
		{
	
	
		}
		System.out.println("After Deserializing..............");
		System.out.println("Employee Id---"+emp.getEmpId());
		System.out.println("Employee Name---"+emp.getEmpName());
		System.out.println("Employee City---"+emp.getAddress().getCity());
		System.out.println("Employee State---"+emp.getAddress().getState());
		System.out.println("Employee Zip---"+emp.getAddress().getZip());


	}

}