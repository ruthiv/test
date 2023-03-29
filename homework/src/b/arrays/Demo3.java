package b.arrays;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		String[] names = new String[5];
		names[0]= "Dan";
		names[1]= "Lea";
		names[2]= "Ruthi";
		names[3]= "Sir";
		names[4]= "David";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println(Arrays.toString(names));

	}

}
