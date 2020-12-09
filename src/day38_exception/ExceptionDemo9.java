package day38_exception;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo9 {

	public static void main(String[] args) {
		
		
		Date d = new Date();
		parseDateToString(d); 
		
	}
	
	public static void parseDateToString(Date date) {
		
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yy");
		String d = sdf.format(date);
		System.out.println(d);
	}
}
