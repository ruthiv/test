package b;

import java.util.ArrayList;
import java.util.List;

public class Targil1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(15);
		list.add(98);
		System.out.println(list);
		System.out.println(list.get(list.size() - 1));
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.println("sum: " + sum);
		double avg = sum / (list.size());
		System.out.println("avg: " + avg);

	}

}
