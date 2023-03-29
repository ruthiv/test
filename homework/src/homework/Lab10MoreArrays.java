package homework;

import java.util.Arrays;

public class Lab10MoreArrays {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 3, 2, 1, 9, 5, 1, 1, 9 };
		int[] arr2 = new int[arr.length];
		int a = 0, b = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				a++;
			} else if (arr[i] == 3) {
				b++;
			}
		}
		System.out.println("The array has: " + a + " number 1" + " and The array has: " + b + " number 3");
		for (int i = 0; i < arr.length; i++) {
			arr2[arr[i]] = arr[i];
		}

		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr2[i] != 0) {
				System.out.print(arr2[i] + " , ");
			}
		}

		int[] arr3 = new int[10];
		int[] arr4 = new int[arr3.length];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = (int) (Math.random() * 11);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr3));
		for (int i = 0, j = arr3.length - 1; i < arr3.length; i++, j--) {
			arr4[j] = arr3[i];
		}
		System.out.println(Arrays.toString(arr4));

		int[][] mat = new int[20][10];
		double sum = 0, sum1 = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int m = (int) (Math.random() * 21 + 80);
				mat[i][j] = m;
				sum += m;
			}
			System.out.print(Arrays.toString(mat[i]));
			System.out.println("\tThe student : " + i + "  average  " + sum / mat[i].length);
			sum1 += sum / 10;
			sum = 0;
		}
		System.out.println("overall average:  " + sum1 / mat.length);
		System.out.printf("overall average: %1.2f%n ", sum1 / 20);

	}

}
