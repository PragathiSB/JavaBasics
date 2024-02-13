package Exercise24Jan;

import java.util.ArrayList;
import java.util.Collections;

public class CopyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<String> list=new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println("the list:"+list);
        
        ArrayList<String> list2=new ArrayList<>();
        list2.add("0");
        list2.add("2");
        list2.add("3");
        list2.add("4");
        System.out.println("the list2:"+list2);
        Collections.copy(list2, list);
        
        System.out.println("the copied list:"+list2);
	}

}
