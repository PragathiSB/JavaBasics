package Trial;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			Readable f=(Readable) new FileWriter("hello.txt");
			Scanner sc=new Scanner(f);
			if(sc.hasNextLine())
			{
				String s=sc.nextLine();
				System.out.println(s);
			}
		
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
