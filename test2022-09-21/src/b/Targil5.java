package b;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Targil5 {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		for (int i = 0; i < 10; i++) {
			set.add((int) (Math.random() * 11));
		}
		System.out.println(set);

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			if (it.next() % 2 == 0) {
				it.remove();
			}
		}

		System.out.println(set);
	}

}
