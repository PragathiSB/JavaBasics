package Exercise25Jan;

import java.util.Calendar;

public class MinimumDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		System.out.println("YEAR:"+cal.getActualMinimum(Calendar.YEAR));
		System.out.println("MONTH:"+cal.getActualMinimum(Calendar.MONTH));
		System.out.println("WEEK:"+cal.getActualMinimum(Calendar.WEEK_OF_YEAR));
		System.out.println("DATE:"+cal.getActualMinimum(Calendar.DATE));

	}

}
