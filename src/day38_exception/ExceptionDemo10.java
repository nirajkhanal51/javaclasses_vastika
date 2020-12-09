package day38_exception;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo10 {

			public static void main(String[] args) {
			
			Date d = new Date();
			parseDateToString(d); 
			
			String date = "2020-01-11";
			System.out.println(date);
			parseStringToDate(date);
			
		}
		
		public static void parseDateToString(Date date) {
			
			System.out.println(date);
			SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yy");
			String d = sdf.format(date);
			System.out.println(d);
		}
		
		public static void parseStringToDate(String d) {
			
			SimpleDateFormat sdf = new SimpleDateFormat("HH:ss a MM/dd/yy");
			
			try {
			Date date = sdf.parse(d); 
			System.out.println(date);
			
			}
			catch(ParseException e){
				e.printStackTrace();
			}
			
		}
	}





