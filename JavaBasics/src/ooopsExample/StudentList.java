package ooopsExample;

import java.util.ArrayList;

public class StudentList {
	ArrayList<Student> studList;
	public StudentList()
	{
		System.out.println("creating student list");
		studList=new ArrayList<>();
	}
	public void addStudent(Student student)
	{
		System.out.println("add student to list");
		studList.add(student);
	}
	public ArrayList getStudents()
	{
		return studList;
	}

}
