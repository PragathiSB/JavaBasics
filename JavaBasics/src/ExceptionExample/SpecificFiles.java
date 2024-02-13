package ExceptionExample;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
public class SpecificFiles {
       public static void main(String a[]){
    System.out.println("enter file name");
    Scanner sc=new Scanner(System.in);
    String filePath=sc.nextLine();
    
    File file = new File(filePath);
        
    String[] fileList = file.list(new FilenameFilter() {
    public boolean accept(File dir, String name) {
    if(name.toLowerCase().endsWith(".txt"))
    {
       return true;
    } else {
        return false;
      }
      }
     });
     for(String fl:fileList){
         System.out.println(fl);
        }
    }
}

