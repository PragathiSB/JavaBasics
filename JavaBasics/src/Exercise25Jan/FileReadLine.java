package Exercise25Jan;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadLine {

	public static void main(String[] args) {
		  try 
		  {
			 
			 FileInputStream file = new FileInputStream("output.txt");
		     BufferedInputStream input = new BufferedInputStream(file);
		     int i = input .read();
		     while (i != -1) 
		     {
		        System.out.print((char) i);
		        i = input.read();
		      }
		      input.close();
		    }
		 
		    catch (Exception e) {
		      e.getStackTrace();
		    }
	
			}

}
