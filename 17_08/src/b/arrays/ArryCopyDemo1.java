package b.arrays;

import java.util.Arrays;

public class ArryCopyDemo1 {

	public static void main(String[] args) {
		
		int [] arr1 = {2,4,6,8};
		int [] arr2 = new int[arr1.length+2];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	
		
		System.out.println("=================");
		int [] arr3 = {2,4,6,8};
		int [] arr4 = new int[arr1.length+2];
		System.arraycopy(arr3, 0, arr4, 0, 2);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println("=================");
		int [] arr5 = {2,4,6,8};
		int [] arr6 = new int[arr1.length+2];
		System.arraycopy(arr5, 2, arr6, 2, 2);
		System.out.println(Arrays.toString(arr5));
		System.out.println(Arrays.toString(arr6));
			
		
		
		

	}

}
