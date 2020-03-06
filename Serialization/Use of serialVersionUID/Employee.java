import java.io.*;

class Employee implements Serializable
{
	private static final long serialVersionUID = 1L;
	//After a suceesful run, now compiling this class with change of serialVersionUID = 2L;
	//private static final long serialVersionUID = 2L; java.io.InvalidClassException: Employee; local class incompatible: stream classdesc serialVersionUID = 1, local class serialVersionUID = 2
    int employeeId;
    String employeeName;
    String department;
    
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}