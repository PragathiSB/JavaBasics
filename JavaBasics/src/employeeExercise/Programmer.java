package employeeExercise;

public class Programmer extends Employee{
	public Programmer(String name,String address,int salary,String jobTitle)
	{
		super(name,address,salary,jobTitle);
	}
	public void bonusCalc(int salary)
	{
		   System.out.println(salary*0.78);
	 }
	 public String performanceReport()
	   {
		  return "satisfactory";
	   }

}
