package ooopsExample;

public class AuditStudent extends Student{
	public AuditStudent(String nam)
	{
		name=nam;
	}
	public void goToClass(String direction)
	{
		System.out.println("go to audit class"+direction);
	}
	
    public void goToClass()
    {
    	
    }
}
