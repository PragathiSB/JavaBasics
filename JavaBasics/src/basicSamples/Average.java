package basicSamples;
import java.util.Scanner;
public class Average {    
	public static void main(String[] args)
    {       
	    int i,num=0,sum=0;
		double avg;
	    System.out.println("enter 5 numbers to find sum and average: ");  
	    for (i=0;i<5;i++)
		{
		  Scanner sc = new Scanner(System.in);
		  num = sc.nextInt();
		  sum +=num;
		}
		avg=sum/5;
		System.out.println("The sum of 5 no is : " +sum);
		System.out.println("The average of 5 no is : " +avg);
	 
	}
	

}
