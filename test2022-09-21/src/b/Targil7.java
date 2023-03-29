package b;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Targil7 {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put("dog", "an animal that barks");
		map.put("car", "a vehicle");
		map.put("java", "a programming language");

		try (Scanner sc = new Scanner(System.in);) {
			System.out.println(map.keySet());
			System.out.println("Enter word");
			String word = sc.nextLine();
			System.out.println(map.get(word));
		}

	}

}
