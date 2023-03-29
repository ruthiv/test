package a;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Integer in = (int) (Math.random() * 11);
			number.add(in);
		}
		System.out.println(number);

	}

}
