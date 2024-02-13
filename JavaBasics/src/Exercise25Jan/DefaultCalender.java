package Exercise25Jan;

import java.util.Calendar;

public class DefaultCalender {
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("YEAR:"+cal.get(Calendar.YEAR));
		System.out.println("MONTH:"+cal.get(Calendar.MONTH));
		System.out.println("DATE:"+cal.get(Calendar.DATE));
		System.out.println("HOUR:"+cal.get(Calendar.HOUR));
		System.out.println("MINUTE:"+cal.get(Calendar.MINUTE));
		
		
	}

}
