package in.co.Practice;


import java.util.Calendar;
import java.util.Date;



public class PCalendar {
public static void main(String[] args) {
	
	Calendar cal = Calendar.getInstance();
	cal.add (Calendar.DATE,20);
	Date d = cal.getTime();
	System.out.println(d);
}
}
