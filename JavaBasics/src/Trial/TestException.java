package Trial;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new TestThrow("this is user defined exception");
		}
		catch(TestThrow ude)
		{
			System.out.println("Caught exception");
			System.out.println(ude.getMessage());
		}

	}

}
