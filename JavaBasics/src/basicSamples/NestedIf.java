package basicSamples;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double n1=2.0,n2=-1.9,n3=5.0,largest=0.0;
		if(n1>n2)
		{
			if(n1>n3)
			{
				largest=n1;
			}
			else
			{
				largest=n3;
			}
		}
		else
		{
			if(n2>n3)
			{
				largest=n2;
			}
			else
			{
				largest=n3;
			}
		
		}
       System.out.println(largest);
	}

}
