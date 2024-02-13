package basicSamples;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String language="Java";
		if(language=="Java")
		{
			System.out.println("best programming language");
		}
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}
		else if(num<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}
	}

}
