package ooopsExample;

public abstract class Student {
	String name;
	String address;
	float gpa;
	final String college="IITC";
	private double average;
	public Student()
	{
		
	}
	public Student(String strName)
	{
		name=strName;
	}
	public abstract void goToClass();
	
    public final void calculateCGP()
    {
    System.out.println(10.5);
    }
    public void goToClass(String direction)
    {
    	
    }
    public double getAverage()
    {
    	return average;
    }
    
    public void setAverage(double s1,double s2,double s3)
    {
    	average=s1+s2+s3/3;
    }
 

}
