package day32;

import java.util.StringTokenizer;

public class StringDemo9 {

	public static void main(String[] args) {
		String lines = "Hello, I am Santosh Lal Karna, I am Java Developer,, I am working at dryice,, Nepal,, I also teach java parttime, I am parttime teacher of Vastika inc., USA"; 
		
		String [] words = lines.split(","); 
		System.out.println(words.length);
		for(String w: words) {
			System.out.println(w);
			
			}
		
		System.out.println("==============================");
		StringTokenizer st = new StringTokenizer(lines, ","); 
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
			
		}
		
	}