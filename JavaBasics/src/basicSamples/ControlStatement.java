package basicSamples;

import java.util.Scanner;

public class ControlStatement {
	public static void main(String args[])
	{
		int sum=0;
		Scanner input =new Scanner(System.in);
	    System.out.println("enetr a number");
	    int num=input.nextInt();
	    while(num>=0)
	    {
	    	sum+=num;
	    	System.out.println("enetr a number");
		    num=input.nextInt();
	    }
	    System.out.println("sum:"+sum);
	}

}
