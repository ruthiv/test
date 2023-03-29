package a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Demo5 {

	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();
		for (int i = 0; i < 25; i++) {
			Integer in = (int) (Math.random() * 10);
			number.add(in);
		}
		Set<Integer> set = new HashSet<>(number);
		System.out.println(set);

	}

}
