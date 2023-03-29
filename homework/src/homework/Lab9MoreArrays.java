package homework;

import java.util.Arrays;

public class Lab9MoreArrays {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
				System.out.print(arr[i] + " , ");
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum2 += arr[i];
				System.out.print(arr[i] + " ,");
			}
		}
		System.out.println();
		if (sum > sum2) {
			System.out.println("sum of all even numbers: " + sum + " , sum of all odd numbers: " + sum2
					+ " , greatereven numbers.");
		} else {
			System.out.println("sum of all even numbers: " + sum + " , sum of all odd numbers: " + sum2
					+ " , greater odd numbers.");

		}
		int[] arr2 = new int[50];
		int max = 0, Imax = 0, min = 100, Imin = 0;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int) (Math.random() * 101);
			if (arr2[i] > max) {
				max = arr2[i];
				Imax = i;
			} else if (arr2[i] < min) {
				min = arr2[i];
				Imin = i;
			}
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("max :" + max + " Imax :" + Imax + "  min :" + min + "  Imin :" + Imin);
	}

}
