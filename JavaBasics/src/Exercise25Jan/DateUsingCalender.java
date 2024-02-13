package Exercise25Jan;

import java.util.Calendar;
import java.util.Date;

public class DateUsingCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar calender=Calendar.getInstance();
		calender.set(Calendar.YEAR,2024);
		calender.set(Calendar.MONTH,01 );
		calender.set(Calendar.DATE, 18);
		Date dt=calender.getTime();
		System.out.println("Date:"+dt);


	}

}
