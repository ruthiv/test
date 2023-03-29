package a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();// לא מסודר לפי הסדר שהכנסתי
		// Set<String> set = new LinkedHashSet<>();// מסדר לפי הסדר שהכנסתי
		// Set<String> set = new TreeSet<>();// מסדר לפי הגודל

		set.add("AAA");
		set.add("AAA");
		set.add("BBB");
		set.add("AAA");
		set.add("CCC");

		System.out.println(set);

		// set.get(0);
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String curr = it.next();
			System.out.println(curr);
			if (curr.length() > 3) {
				it.remove();
			}
		}
		System.out.println(set);

		int id = 235546;
		Integer idObj = id;
		System.out.println(idObj.toString().length());
	}

}
