package b.arrays.dimensions;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		char[][] kolnoa = new char[7][10];
		for (int i = 0; i < kolnoa.length; i++) {
			for (int j = 0; j < kolnoa[i].length; j++) {
				kolnoa[i][j]= '0';
			}
			
		}
		print(kolnoa);
		kolnoa[0][0]= 'x';
	    kolnoa[6][9]= 'x';
	    print(kolnoa);
	}  
	     static void print(char[][] kolnoa) {
	    	 System.out.println("==kolnoa==");
	    	 for (int i = 0; i < kolnoa.length; i++) {
					for (int j = 0; j < kolnoa[i].length; j++) {
						System.out.print(kolnoa[i][j]+ " ");
					}
					System.out.println();
	    	 }			 
	     }
	
 
}
