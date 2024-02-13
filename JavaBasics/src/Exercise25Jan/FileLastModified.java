package Exercise25Jan;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 

public class FileLastModified {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C://New folder/jan-24task.txt");
		long lastModi=file.lastModified();
		DateFormat sdf= new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("last modified date:"+ sdf.format(lastModi));

	}

}
