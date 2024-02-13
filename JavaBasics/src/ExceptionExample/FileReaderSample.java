package ExceptionExample;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array=new char[100];
		
		FileReader input=null;
		try
		{
			System.out.println("current folder"+System.getProperty("user.dir"));
			input=new FileReader("input.txt");
			input.read(array);
		}
		catch(FileNotFoundException exp) {
		 exp.printStackTrace();
        }
		catch(IOException e){
			e.printStackTrace();
		}
		finally {
			try
			{
				input.close();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		
	}
	System.out.println("data in the file:");
	System.out.println(array);
	}

}
