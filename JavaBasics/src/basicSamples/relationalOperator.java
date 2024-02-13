package basicSamples;

public class relationalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b=11;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println((5<3)&&(8>5));	
		System.out.println((5<3)||(8>5));
		System.out.println((5<3)&(8>5));
		System.out.println((5<3)|(8>5));
		System.out.println((5>3)||(8>5));
		System.out.println((5<3)||(8<5));
		System.out.println(!(5==3));
		System.out.println(!(5>3));
	}

}
