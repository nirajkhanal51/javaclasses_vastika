package day38_exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo11 {

			public static void main(String[] args) {
			
			Date d = new Date();
			parseDateToString(d); 
			
			String date = "2020-01-11";
			System.out.println(date);
			
			
			try {
			parseStringToDate(date);
			}
			catch (ParseException e) {
				e.printStackTrace();
			}
			
		}
			public static void parseStringToDate(String d) throws ParseException{
				
				SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yy");
				Date date = sdf.parse(d);
				System.out.println(date);
		
			
		}
		
			public static void parseStringToDate1(String d)  {
				
				
				SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yy");
				
				
			
		}
	}





