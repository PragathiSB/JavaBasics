package basicSamples;

import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length in inches:");
		Scanner inp=new Scanner(System.in);
		float inches=inp.nextInt();
		float meter=inches/39.37f;
		System.out.println("meters:"+meter);
	}

}
