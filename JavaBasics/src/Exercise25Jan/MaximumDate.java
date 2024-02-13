package Exercise25Jan;
import java.util.*;
public class MaximumDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		cal.getTime();
		System.out.println("YEAR:"+cal.getActualMaximum(Calendar.YEAR));
		System.out.println("MONTH:"+cal.getActualMaximum(Calendar.MONTH));
		System.out.println("WEEK:"+cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
		System.out.println("DATE:"+cal.getActualMaximum(Calendar.DATE));
		

	}

}
