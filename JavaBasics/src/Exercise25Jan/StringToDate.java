package Exercise25Jan;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("enter date:");
		Scanner sc=new Scanner(System.in);
		String date=sc.nextLine();
		Date date1=new SimpleDateFormat("dd/mm/yyyy").parse(date);
        System.out.println(date1);
	}

}
