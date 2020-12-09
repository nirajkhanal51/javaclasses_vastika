package day32;

import java.util.StringTokenizer;

public class StringDemo8 {

	public static void main(String[] args) {
		
		String lines = "Hello, I am Santosh Lal Karna, I am Java Developer, I am working at dryice, Nepal, I also teach java parttime, I am parttime teacher of Vastika inc., USA"; 
				
		StringTokenizer st = new StringTokenizer(lines);  
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
			
			}
		
		System.out.println("==============================");
		st = new StringTokenizer(lines, ","); 
		
		while(st.hasMoreTokens()) {
			
			System.out.println(st.nextToken());
		}
			
		}
		
	}