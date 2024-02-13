package basicSamples;

import java.text.NumberFormat;

public class HelloWorld {
    int i=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld obj=new HelloWorld();
		System.out.println("hello world...");
		System.out.println(obj.i);
	    float myfloat=2.30f;
	    double d=2.0;
	    String st="hello";
	    short te=-200;
	    char letter='a';
	    int irange=-12338;
	    long range=67;
	    double dl=3.445e2;
	    System.out.println(myfloat);
	    System.out.println(d);
	    System.out.println(st);
	    System.out.println(te);
	    System.out.println(letter);
	    System.out.println(irange);
	    System.out.println(dl);
	    System.out.println(NumberFormat.getCurrencyInstance());
	    
	}
}
