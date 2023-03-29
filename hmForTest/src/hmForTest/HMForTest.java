package hmForTest;

import java.util.Arrays;

public class HMForTest {

	public static void main(String[] args) {
		int[] nums1 = new int[25];
		int[] nums2 = new int[25];
		for (int i = 0; i < nums1.length; i++) {
			nums1[i] = (int) (Math.random() * 10);
			nums2[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		int[] ezer = new int[10];
		for (int i = 0; i < nums1.length; i++) {
			if (ezer[nums1[i]] != 0) {
				ezer[nums1[i]] *= 10;
				ezer[nums1[i]] += nums1[i];
			} else {
				ezer[nums1[i]] += nums1[i];
			}

		}
		System.out.println(Arrays.toString(ezer));
		int[] ezer2 = new int[10];
		for (int i = 0; i < nums2.length; i++) {
			if (ezer2[nums2[i]] != 0) {
				ezer2[nums2[i]] *= 10;
				ezer2[nums2[i]] += nums2[i];
			} else {
				ezer2[nums2[i]] += nums2[i];
			}

		}
		System.out.println(Arrays.toString(ezer2));
		int max = 0;
		for (int i = 0; i < ezer.length; i++) {
			if (max < ezer[i]) {
				max = ezer[i];
			}
		}

		System.out.println(max);
		int[] max5 = new int[5];
		int big = 9;
		for (int i = 0; i < max5.length; i++) {
			for (int j = 0; j < nums1.length; j++) {
				if (nums1[j] == big || nums2[j] == big) {
					max5[i] = big;
				}
			}
			big--;

		}
		System.out.println(Arrays.toString(max5));
		// int max1 = 0, max2 = 0, max3 = 0;
		// int[]EzerNum1= new int[nums1.length];
		// for (int i = 0; i < nums1.length; i++) {
//
		// }
		for (int i = 1; i < ezer.length; i++) {
			if (ezer[i] == 0) {
				ezer[i] = -1;
			}
		}
		for (int i = 8; i >= 0; i -= 2) {
			if (ezer[i] / 10 == 0 && ezer[i] != -1) {
				System.out.print(ezer[i]);
			}
		}
		System.out.println();
		for (int i = 9; i >= 1; i -= 2) {
			if (ezer2[i] / 10 == 0 && ezer2[i] != 0) {
				System.out.print(ezer2[i]);
			}
		}

	}

}
