package basicSamples;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter month");
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		int numdays=0;
		switch(month)
		{
		case 1:
		{
			numdays=31;
			break;
		}
		case 3:
		{
			numdays=31;
			break;
		}
		case 4:
		{
			numdays=30;
			break;
		}
		case 5:
		{
			numdays=31;
			break;
		}
		case 6:
		{
			numdays=30;
			break;
		}
		case 7:
		{
			numdays=31;
			break;
		}
		case 8:
		{
			numdays=31;
			break;
		}
		case 9:
		{
			numdays=30;
			break;
		}
		case 10:
		{
			numdays=31;
			break;
		}
		case 11:
		{
			numdays=30;
			break;
		}
		case 12:
		{
			numdays=31;
			break;
		}
		case 2:
		{
			if(((year%4)==0 &&!(year%100==0))|| (year%400==0))
			{
				numdays=29;
			}
			else
			{
				numdays=28;
			}
			}
		}
		System.out.println("numdays:"+numdays);	
	}
	

}
