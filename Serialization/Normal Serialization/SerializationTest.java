// program for normal serialization
// Author: Ismaeel Siddiqui

import java.io.*;

class Employee implements Serializable
{
private int empId;
private String empName;
private String address;

public void setId(int empId)
{
this.empId = empId;

}

public void setEmpName(String  empName)
{
this.empName = empName;

}

public void setAddress(String address)
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

public String getAddress()
{

return address;
}

}

class SerializationTest 
{
public static void main(String[] args)
{

Employee emp = new Employee();

emp.setId(101);
emp.setEmpName("Ismaeel");
emp.setAddress("Bhopal");

System.out.println("Before serializing..............");

System.out.println("Employee Id---"+emp.getEmpId());
System.out.println("Employee Name---"+emp.getEmpName());
System.out.println("Employee Address---"+emp.getAddress());

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
System.out.println("Employee Address---"+emp.getAddress());


}

}