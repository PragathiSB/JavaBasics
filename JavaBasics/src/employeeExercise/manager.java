package employeeExercise;

public class manager extends Employee{
	public manager(String name,String address,int salary,String jobTitle)
	{
		super(name,address,salary,jobTitle);
	}
	public void bonusCalc(int salary)
	{
		   System.out.println(salary*0.5);
	 }
	 public String performanceReport()
	   {
		  return "good";
	   }
}
