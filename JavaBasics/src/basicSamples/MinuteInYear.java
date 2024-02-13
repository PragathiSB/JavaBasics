package basicSamples;
import java.util.Scanner;
public class MinuteInYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minutesInYear = 60 * 24 * 365;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of minutes: ");
        double min = sc.nextDouble();
        int years =(int) (min / minutesInYear);
        int days = (int)(min / 60 / 24) % 365;

        System.out.println("years:" + years + " days:" + days);
	}

}
