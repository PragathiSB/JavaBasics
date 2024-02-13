package Trial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadSample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:\\New folder\\jan-24task.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null)
		{
			System.out.println(st);
		}

	}

}
