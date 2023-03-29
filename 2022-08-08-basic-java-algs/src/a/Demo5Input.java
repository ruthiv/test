package a;

import java.util.Scanner;

public class Demo5Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number :");
		int a = sc.nextInt();
		System.out.print("Enter 1nd number :");
		int b = sc.nextInt();
		int sum = a+b;
		System.out.println(sum);
		sc.close();

	}

}
