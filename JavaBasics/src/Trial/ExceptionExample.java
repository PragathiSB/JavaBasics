package Trial;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			PrintWriter pw=new PrintWriter("knn.txt");
			pw.println("save");
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		System.out.println("file saved successfully");
	}

}
