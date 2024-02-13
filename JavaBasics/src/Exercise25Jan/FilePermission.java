package Exercise25Jan;

import java.io.File;

public class FilePermission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C://New folder");
		File files[]=file.listFiles();
		for(int i=0;i<files.length;i++)
		{
		if(files[i].canRead())
		{
			System.out.println(files[i].getName());
			System.out.println("can read");
		}
		else if(!(files[i].canRead()))
		{
			System.out.println(files[i].getName());
			System.out.println("cannot read");	
		}
		
		}
		for(int i=0;i<files.length;i++)
		{
		if(files[i].canWrite())
		{
			System.out.println(files[i].getName());
			System.out.println("can write");
		}
		else if(!(files[i].canWrite()))
		{
			System.out.println(files[i].getName());
			System.out.println("cannot write");	
		}
		
		}

	}

}
