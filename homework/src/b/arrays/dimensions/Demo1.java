package b.arrays.dimensions;

import java.util.Arrays;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		int[][] matrixs = new int [4][5];
		matrixs[2][3]= 17;
		for (int i = 0; i < matrixs.length; i++) {
			System.out.println(Arrays.toString(matrixs[i]));
		} 
			
		
	}

}
