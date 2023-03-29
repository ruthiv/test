import java.util.Arrays;

public class TwoArr {

	public static void main(String[] args) {
		int length = 5;
		int[] arr1 = new int[length];
		int[] arr2 = new int[length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int) (Math.random() * 10);
			arr2[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int[] ezer = new int[arr1.length];
		System.arraycopy(arr1, 0, ezer, 0, arr1.length);
		for (int i = ezer.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				int a = ezer[j];
				int b = ezer[j + 1];
				if (a > b) {
					ezer[j] = b;
					ezer[j + 1] = a;
				}
			}

		}
		System.out.println(Arrays.toString(ezer));
		for (int i = 0; i < ezer.length - 1; i++) {
			int a = ezer[i];
			int b = ezer[i + 1];
			if (a == b) {
				ezer[i] = (a * 10) + b;
				ezer[i + 1] = -1;
			}

		}
		System.out.println(Arrays.toString(ezer));
		int[] arr3 = new int[length];
		int ind = 0;
		for (int digit = 9; digit >= 0 && ind < length; digit--) {
			for (int i = 0; i < arr3.length; i++) {
				if (arr1[i] == digit || arr2[i] == digit) {
					arr3[ind++] = digit;
					break;
				}
			}

		}
		System.out.println(Arrays.toString(arr3));
		int max = arr3[0];
		int x = max * 100 + max * 10;
		int c = 0;
		for (int i = 0; i < length; i++) {
			if (arr1[i] == max) {
				c++;
			}
			if (arr2[i] == max) {
				c++;
			}
		}
		if (c >= 2) {
			x += max;
		} else {
			x += arr3[1];
		}

		System.out.println(x);
		boolean found = false;
		int evenDigits = 0;
		for (int digit = 8; digit >= 0; digit -= 2) {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == digit) {
					evenDigits *= 10;
					evenDigits += digit;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("evens:" + evenDigits);
		} else {
			System.out.println("no even digits found");
		}

		found = false;
		int oddDigits = 0;
		for (int digit = 9; digit >= 1; digit -= 2) {
			for (int i = 0; i < arr2.length; i++) {
				if (arr2[i] == digit) {
					oddDigits *= 10;
					oddDigits += digit;
					found = true;
					break;
				}
			}
		}
		if (found) {
			System.out.println("odds:" + oddDigits);
		} else {
			System.out.println("no odd digits found");
		}
	}

}
