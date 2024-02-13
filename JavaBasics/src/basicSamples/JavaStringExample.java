package basicSamples;

public class JavaStringExample {

	public static void main(String[] args)
	{
		String type="java programming";
		String first="java is a programming language ";
		String second="python";
		String third="Language";
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
		
		System.out.println("length of string:"+first.length());
		String substr=first.substring(5,22);
		System.out.println(substr);
		
		String joinedString=first.concat(third);
		System.out.println("concated string:"+joinedString);
		
		String fr=new String("hello world");
		String sc=new String("hello world");
		System.out.println(fr.equals(sc));
		System.out.println(first==second);
		System.out.println(first.equals(second));
		System.out.println(first.charAt(2));
		System.out.println(first.toUpperCase());
		String[] arr=first.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(first.concat(second));
	}
}
