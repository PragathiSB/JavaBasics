package Exercise24Jan;

import java.util.ArrayList;
import java.util.Collections;

public class ListReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        ArrayList<String> list=new ArrayList<>();
	        list.add("10");
	        list.add("20");
	        list.add("30");
	        list.add("40");
	        System.out.println("list before reversing:"+list);
	        Collections.reverse(list);
	        System.out.println("list after reversing:"+list);
	}

}
