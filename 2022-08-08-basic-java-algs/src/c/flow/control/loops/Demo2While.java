package c.flow.control.loops;

import java.util.Scanner;

public class Demo2While {    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int secretPassword = 123;
		System.out.print("enter password: ");
		int input = sc.nextInt();
		// <> in java is != 
		while(input != secretPassword) {
			System.out.print("enter password: ");
			input = sc.nextInt();
		}
		System.out.println("you are logged in");
		sc.close();
		
		
		

	}

}
