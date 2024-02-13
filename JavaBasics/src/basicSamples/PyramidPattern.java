package basicSamples;

import java.util.Scanner;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,n,j,b=1,c;
		System.out.println("enter the number of rows:");
		Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
		  for(c=n+1;c>i;c--)
		  {
		    System.out.print(" ");; 
		   }
		   for(j=1;j<=i;j++)
		   {
		     System.out.print(i);
		     System.out.print(" ");
		   }
		     System.out.println();
		 }
		    
        }
}


