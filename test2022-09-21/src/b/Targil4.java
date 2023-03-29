package b;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Targil4 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Sir");
		set.add("David");
		set.add("Ruthi");
		System.out.println(set);

		Iterator<String> it = set.iterator();
		for (int i = 0; it.hasNext(); i++) {
			String curr = it.next();
			if (i == 2) {
				System.out.println(curr);
				break;
			}
		}
	}

}
