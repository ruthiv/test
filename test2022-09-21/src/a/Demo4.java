package a;

import java.util.HashSet;
import java.util.Set;

public class Demo4 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		while (set.size() < 10) {
			Integer in = (int) (Math.random() * 11);
			set.add(in);
		}
		System.out.println(set);
	}

}
