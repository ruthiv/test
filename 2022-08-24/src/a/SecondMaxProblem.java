package a;

import java.util.Scanner;

public class SecondMaxProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 enter number: ");
		int input = sc.nextInt();
		int m1 = input;
		int m2 = input;
		for (int i = 2; i <= 10; i++) {
			System.out.print(i + " enter number: ");
			input = sc.nextInt();
			if (m1 == m2) {
				if (input > m1) {
					m1 = input;
				} else {
					m2 = input;
				}
			} else {
				if (input > m1) {
					m2 = m1;
					m1 = input;
				} else if (input < m1 && input > m2) {
					m2 = input;
				}

			}
		}
		sc.close();
		if (m1 != m2) {
			System.out.println("Second max is: " + m2);

		} else {
			System.out.println("all input is " + m1);
		}

	}

}
