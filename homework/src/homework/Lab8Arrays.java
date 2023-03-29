package homework;

import java.util.Arrays;

public class Lab8Arrays {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int sum = 0;
		int max = 0, Imax = 0, min = 100, Imin = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
			if (arr[i] > max) {
				max = arr[i];
				Imax = i;
			}
			if (arr[i] < min) {
				min = arr[i];
				Imin = i;
			}
			sum += arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("sum :" + sum + "the average: " + (double) sum / arr.length);
		System.out.println("The maximum number :" + max + " its index in the array :" + Imax);
		System.out.println("The minimum number :" + min + " its index in the array :" + Imin);
	}

}
