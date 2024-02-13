package basicSamples;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class hashSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> evenNumber=new HashSet<>();
		
		evenNumber.add(4);
		evenNumber.add(2);
		evenNumber.add(8);
		evenNumber.add(6);
		System.out.println("hashSet:"+evenNumber);
		
		HashSet<Integer> numbers=new HashSet<>();
	    numbers.addAll(evenNumber);
	    numbers.add(5);
	    System.out.println("new hashset:"+numbers);
	    
	    Iterator<Integer> iterate=numbers.iterator();
	    System.out.println("hash using iterator:");
	    while(iterate.hasNext())
	    {
	    	System.out.print(iterate.next());
	    	System.out.print(",");
	    	
	    }
	    boolean value1=numbers.remove(5);
	    System.out.println("is 5 removed?"+value1);
	    
	    boolean value2=numbers.removeAll(numbers);
	    System.out.println("are all elements removed?"+value2);
	    
	    HashSet<String> empList=new HashSet<>();
	    empList.add("john");
	    empList.add("peter");
	    empList.add("andrew");
	    System.out.println("list of employes after adding john.."+empList);
	    
	    TreeSet<String> empList1=new TreeSet<>();
	    empList1.add("john");
	    empList1.add("peter");
	    empList1.add("andrew");
	    System.out.println("list of employes.."+empList1);
	    
	    
	    
		

	}

}
