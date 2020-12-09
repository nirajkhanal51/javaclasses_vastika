package day19;

public class ArrayDemo5 {

	public static void main(String[] args) {
		
		final int ROW = 3; 
		final int COLUMN = 3 ;
		
		int [] [] arr = new int [ROW] [COLUMN];
		
		arr [0][0] =3; 
		arr [0][1] =4;
		arr [0][2] =6;
		
		arr [1][0] =5;
		arr [1][1] =17;
		arr [1][2] =11;
		
		arr [2][0] =10;
		arr [2][1] =15;
		arr [2][2] =19;
		
		
		for (int i = 0; i < ROW; i ++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.println(arr[i][j] + " ");}
			}
		System.out.println();
		}

	}

