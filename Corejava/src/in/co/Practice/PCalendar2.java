package in.co.Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PCalendar2 {
public static void main(String[] args)throws ParseException {
	String giveDate = "5/8/2023";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
	Calendar cal = Calendar.getInstance();
	cal.setTime(sdf.parse(giveDate));
	for (int i = 0; i <=12; i++) {
		cal.add(Calendar.DATE, 30);
		java.util.Date d = cal.getTime();
		System.out.println(sdf.format(d));
		
		
	}
	
	
	
	
	
}
}
