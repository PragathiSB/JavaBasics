package ooopsExample;
import java.util.ArrayList;
public class StudentDriver {
	public static void main(String[] args)
	{
		
//		System.out.println("student1"+s1.address+s1.gpa+s1.name);
//		System.out.println("student1"+s2.address+s2.gpa+s2.name);
		
		MNCStudent mStud=new MNCStudent("mike");
		int t=mStud.calculateAttendence();
		System.out.println(t);
		 MNCStudent pStud=new MNCStudent("rosy");	
		pStud.gpa=4.5f;
		
		Student audit=new AuditStudent("rina");
		
		mStud.goToClass();
		pStud.goToClass();
		
		StudentList studList=new StudentList();
		
		studList.addStudent(mStud);
		studList.addStudent(pStud);
		studList.addStudent(audit);
		
		ArrayList<Student> list=studList.getStudents();
		for(Student stud:list)
		{
			stud.goToClass();
			stud.calculateCGP();
			stud.goToClass("go");
		}
	}

}
