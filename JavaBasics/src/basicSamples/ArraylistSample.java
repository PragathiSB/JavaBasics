package basicSamples;
import java.util.ArrayList;
public class ArraylistSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				// TODO Auto-generated method stub
				ArrayList<String> languages=new ArrayList<>();
				System.out.println("size:"+languages.size());
				
				languages.add("Java");
				languages.add("python");
				languages.add("swift");
				languages.add("typescript");
				System.out.println("arraylist:"+languages);
				System.out.println("size:"+languages.size());
				
				System.out.println("size:"+languages.get(1));
				languages.set(2, "JavascriptScript");
				
                languages.remove(3);
                System.out.println("after arraylist"+languages);
                

	}

}
