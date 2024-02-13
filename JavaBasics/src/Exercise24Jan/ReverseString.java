package Exercise24Jan;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString obj=new ReverseString();
		System.out.println("enter the input:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		obj.revMethod(arr);
		
	}
	
	public void revMethod(String[] arr)
	{
		String reverse="";
        for(String s:arr)
        {
   
	      for(int i=s.length()-1;i>=0;i--)
	      {
	    	  reverse=reverse+s.charAt(i);
	      }
	      reverse=reverse+" ";
        }
        System.out.println(reverse);
	}
	}