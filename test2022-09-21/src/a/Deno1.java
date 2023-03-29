package a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deno1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		boolean added = list.add("AAA");
		System.out.println("added? " + added);

		added = list.add("BBB");
		System.out.println("added? " + added);

		System.out.println("size: " + list.size());
		System.out.println(list);

		list.remove("AAA");
		System.out.println(list);

		System.out.println("is empty? " + list.isEmpty());

		System.out.println("contains BBB? " + list.contains("BBB"));
		System.out.println("contains ZZZ? " + list.contains("ZZZ"));

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

		Object[] objects = list.toArray();
		String[] strings = list.toArray(new String[list.size()]);

		System.out.println(Arrays.toString(objects));
		System.out.println(Arrays.toString(strings));

		list.clear();
		System.out.println(list);

	}

}
