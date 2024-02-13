package basicSamples;
import java.util.Scanner;
public class FarenheitCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the temperature in farenheit");
		Scanner inp=new Scanner(System.in);
		float farenheit=inp.nextInt();
		float c=(farenheit-32)*5/9;
		System.out.println("celcius:"+c);
		

	}

}
