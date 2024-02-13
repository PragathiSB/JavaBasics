package employeeExercise;

import java.util.ArrayList;

public class EmployeeList {
	ArrayList<Employee> EmpList;
	public EmployeeList()
	{
		System.out.println("creating student list");
		EmpList=new ArrayList<>();
	}
	public void addStudent(Employee emp)
	{
		System.out.println("add Employee to list");
		EmpList.add(emp);
	}
	public ArrayList getEmployee()
	{
		return EmpList;
	}

}
