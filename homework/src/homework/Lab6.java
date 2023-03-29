package homework;

public class Lab6 {

	public static void main(String[] args) {
		int[] arr = new int[40];
		arr[0] = 1;
		arr[1] = 1;
		System.out.print(arr[0] + " , ");
		System.out.print(arr[1] + " , ");
		for (int i = 2; i < arr.length; i++) {
			arr[i] = (arr[i - 1] + arr[i - 2]);
			System.out.print(arr[i] + " , ");
		}
		System.out.println();
		System.out.println("===========");
		int j = (int) (Math.random() * 40) + 1;
		System.out.println(j);
		for (int x = 1; x != j + 1; x++) {
			if (x == j) {
				System.out.println(arr[x - 1]);
			}
		}
		System.out.println("===========");
		int k = (int) (Math.random() * 41) + 10;
		System.out.println(k);
		for (int k1 = 0; k1 != (k - 10); k1++) {
			System.out.print(arr[k1] + " , ");
		}

	}

}
