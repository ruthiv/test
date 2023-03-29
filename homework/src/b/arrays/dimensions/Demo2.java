package b.arrays.dimensions;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[][] matrixs = new int[5][3];
		for (int i = 0; i < matrixs.length; i++) {
			for (int j = 0; j < matrixs[i].length; j++) {
				matrixs[i][j]= (int)(Math.random()*101);
			}
			System.out.println(Arrays.toString(matrixs[i]));
		}
		
	}

}
