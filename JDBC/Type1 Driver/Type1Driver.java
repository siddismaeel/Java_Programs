//Program for jdbc odbc database connection
//author Ismaeel Siddiqui
//Note this program can run upto java 1.7 version only 

import java.sql.*;
import java.util.*;

class Type1Driver
{
	public static void main(String[] args) throws SQLException, Exception
	{	
		Scanner sc = new Scanner(System.in);
		ResultSet rs = null;

		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		System.out.println("Driver Loaded");
		
		try(Connection con = DriverManager.getConnection("jdbc:odbc:ds", "admin","admin"))
		{
		
		System.out.println("Connection created successfully");
		
		Statement st = con.createStatement();
		System.out.println("Statement object created successfully");
		
		String ddTable = "create Table student(student_id Number, student_name Text, student_email Text)";
		
		try
		{
			st.execute(ddTable);
		}
		catch(Exception e)
		{
			System.out.println("Table already exists");
		}
		
		System.out.println("Enter Student Id");
		int id = sc.nextInt();
		
		System.out.println("Enter Student Name");
		String name = sc.next();
		
		System.out.println("Enter Student email");
		String email = sc.next();
		
		System.out.println("Enter Student Mobile number");
		
		
		
		int i = st.executeUpdate("insert into student values(" + id + "," + "'" + name + "'" + "," + "'" + email + "'"  + ")");
		
		System.out.println("Numbr of rows affected"+i);
		
		rs = st.executeQuery("select * from student");
		
		
		while(rs.next())
		{
			System.out.println("Student Id = " + rs.getInt(1));
			System.out.println("Student Name = " + rs.getString(2));
			System.out.println("Student email = " + rs.getString(3));
			
		}
		
		}
	
	}
}