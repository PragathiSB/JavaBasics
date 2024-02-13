package Exercise25Jan;

import java.io.File;

public class FileSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        File file = new File("C://New folder/jan-24task.txt");
        
		if (file.exists()) 
		{ 
		  double bytes = file.length(); 
		  double kilobyte = bytes / 1024; 
		  double megabyte = kilobyte / 1024; 

		  System.out.println("bytes : " + bytes); 
		  System.out.println("kilobytes : " + kilobyte); 
		  System.out.println("megabytes : " + megabyte); 
		} 
		else 
		{ 
		  System.out.println("File does not exist"); 
		} 
			
	} 
	

}
