package b.arrays;

public class Demo2 {

	public static void main(String[] args) {
		int[] arr = new int [25];
		int sum =0;
		for(int i = 0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*101);
			System.out.println(arr[i]);
			sum+=arr[i];
		}
		System.out.println("sum :"+ sum);

	}

}
