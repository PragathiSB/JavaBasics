package Exercise24Jan;

import java.util.HashMap;
import java.util.Scanner;

public class KeyMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hash=new HashMap<>();
		hash.put(1, "Rosy");
		hash.put(2, "James");
		hash.put(3, "Carl");
		
		System.out.println("enter key to be searched:");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(hash.containsKey(s))
		{
			System.out.println("the value is:"+hash.get(s));
		}
		else
		{
			System.out.println("key doesn't exist");
		}
	}

}
