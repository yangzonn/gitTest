package testjava;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TestDate {
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		
//		convert a string into date/time
		
		String s = "2018-09-26 22:24:25.0";
		Timestamp ts = Timestamp.valueOf(s);
		System.out.println(ts);
		
		Calendar cJapan = new GregorianCalendar(TimeZone.getTimeZone("Japan"));
		System.out.println(cJapan.get(Calendar.HOUR_OF_DAY));
		
		for (String str : TimeZone.getAvailableIDs()) {
			System.out.println(str);
			
		}
		
	}

}
