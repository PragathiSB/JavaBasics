package Exercise24Jan;

import java.util.HashSet;
import java.util.Scanner;

public class RetainSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hash=new HashSet();
		System.out.println("enter the number of elements in list1:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the elements in list1:");
		for(int i=0;i<n;i++)
		{
			hash.add(sc.nextInt());
		}
		HashSet<Integer> hash1=new HashSet();
		System.out.println("enter the number of elements in list2:");
		int nu=sc.nextInt();
		System.out.println("enter the elements in list2:");
		for(int i=0;i<nu;i++)
		{
			hash1.add(sc.nextInt());
		}
		hash.retainAll(hash1);
		System.out.println(hash);
	
	}

}
