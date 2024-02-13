package ExceptionExample;

import java.io.FileWriter;

public class FileWriterSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="read value";
		try {
			FileWriter output=new FileWriter("output.txt",true);//if true-append,else it will overwrite in output
			
			output.write(data);
			output.flush();
			output.close();
		}
		catch(Exception e){
			e.getStackTrace();
			
		}

	}

}
