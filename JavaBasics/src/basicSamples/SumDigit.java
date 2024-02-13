package basicSamples;
import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter a number between 0 and 1000");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		if(num>0 && num<1000)
		{
			int temp;
			while(num>0)
			{
			  temp=num%10;
			  sum+=temp;
			  num=num/10;
			}
		}
		else if(num==0)
		{
			System.out.println("number netered is zero.please enter a number greater than zero");
		}
		else
		{
			System.out.println("number entered is greater than 1000.please enter less than 1000");
		}
		System.out.println("sum:"+sum);
	}

}
