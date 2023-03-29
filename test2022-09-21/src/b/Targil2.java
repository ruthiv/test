package b;

import java.util.ArrayList;
import java.util.List;

public class Targil2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			list.add((int) (Math.random() * 61 + 20));
		}
		System.out.println(list);
		System.out.println("number of elements " + list.size());
		System.out.println("first element " + list.get(0));
		System.out.println("10th element " + list.get(9));
		System.out.println("last element " + list.get(list.size() - 1));
		boolean contains;
		contains = list.contains(25);
		System.out.println("contains 25? " + contains);
		if (contains) {
			System.out.println("index: " + list.indexOf(25));

		}

	}

}
