package week2.day1;

public class EmployeeDetails {
    public void printEmployeeName(String Name) {
	System.out.println(Name);
    }
	public void printEmployeeId(int Id) {
	System.out.println(Id);
	}
	public void printEmployeeAddress(String Address) {
	System.out.println(Address);
	}
	public void printEmployeeSalary(double Salary) {
	System.out.println(Salary);
	}
	public void printMobileNumber(long MobileNumber) {
	System.out.println(MobileNumber);
	}
	
	public static void main(String[] args) {
		EmployeeDetails emp=new EmployeeDetails();
		emp.printEmployeeName("raj");
		emp.printEmployeeId(20);
		emp.printEmployeeAddress("madurai");
		emp.printEmployeeSalary(20000);
		emp.printMobileNumber(7708539720l);
	}
}

