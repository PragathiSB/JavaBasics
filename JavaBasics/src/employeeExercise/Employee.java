package employeeExercise;

public class Employee {
   private String name;
   private String address;
   private int salary;
   private String jobTitle;
   public Employee(String name,String address,int salary,String jobTitle)
   {
	   this.name=name;
	   this.address=address;
	   this.salary=salary;
	   this.jobTitle=jobTitle;
   }
   public void bonusCalc(int salary)
   {
	   System.out.println(salary*0.8);
   }
   public String performanceReport()
   {
	  return "good";
   }
   
   public void ManagingReport()
   {
	   System.out.println("manages reprt");
   }
  
}
