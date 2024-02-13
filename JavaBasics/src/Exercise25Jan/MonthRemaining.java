package Exercise25Jan;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class MonthRemaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d=LocalDate.now();
		LocalDate lastdayOfYear=d.with(TemporalAdjusters.lastDayOfYear());
		Period period=d.until(lastdayOfYear);
		System.out.println("Months remaining in the year:"+period.getMonths());

	}

}
