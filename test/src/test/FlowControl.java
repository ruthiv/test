package test;

import java.util.Arrays;

public class FlowControl {

	public static void main(String[] args) {
		int length = 15;
		int[] nums1 = new int[length];
		int[] nums2 = new int[length];
		for (int i = 0; i < length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int digit = (nums1[0] * 100) + (nums1[1] * 10 + (nums1[2]));
		int ezer = 0;
		for (int i = 1; i < nums1.length - 2; i++) {
			ezer = (nums1[i] * 100) + (nums1[i + 1] * 10 + (nums1[i + 2]));
			if (ezer > digit) {
				digit = ezer;
			}
		}
		System.out.println("The largest three-digit number is: " + digit);
		int count = 0;
		// int[] distinct = new int[10];
		// for(int i = 0; i< distinct.length; i++) {
		// distinct[i]= -1;
		// }
		int[] distinct = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		for (int num = 0; num <= 9; num++) {
			boolean found = false, twoFound = false;
			for (int i = 0; i < nums1.length; i++) {
				if (nums1[i] == num) {
					found = true;
					for (int j = 0; j < nums2.length; j++) {
						if (nums2[j] == num) {
							twoFound = true;
							break;
						}
					}

				} else if (nums2[i] == num) {
					found = true;
					for (int j = 0; j < nums1.length; j++) {
						if (nums1[j] == num) {
							twoFound = true;
							break;
						}
					}
				}
			}
			if (found == true && twoFound == false) {
				distinct[count++] = num;
			}
		}
		System.out.println(Arrays.toString(distinct));
		int distinct1 = 0;
		boolean foundNum = false;
		for (int i = distinct.length - 1; i >= 0; i--) {
			if (distinct[i] > -1) {
				foundNum = true;
				distinct1 *= 10;
				distinct1 += distinct[i];
			}

		}
		if (foundNum == true) {
			System.out.println("The number is: " + distinct1);
		} else {
			System.out.println("No number found in array");
		}

	}

}
