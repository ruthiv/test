package d;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        	int password = 123;
			int input;
			do {
				System.out.println("Enter password");
				input = sc.nextInt();
			}
			while(input != password);
		sc.close();
	     
       System.out.println(input);
	}

}
