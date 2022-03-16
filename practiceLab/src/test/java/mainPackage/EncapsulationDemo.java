package mainPackage;
/*
 * Binding data with methods is called as Encapsulation.
 * Making variables/Data private and access then with public methods
 * Use is to maintain logs. when user access/modifies, we can use sysout statement 
 */

public class EncapsulationDemo {

	public static void main(String[] args) {
		EmpDetails obj = new EmpDetails();
		obj.setEmpNo(1686198);
		obj.setEmpName("Bhargav");
		System.out.println("Emp No: " + obj.getEmpNo());
		System.out.println("Emp Name: " + obj.getEmpName());

	}

}

class EmpDetails {
	private int empNo;
	private String empName;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
