package switchDemo;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 0-10");
		int number = sc.nextInt();
		sc.close();
	
		switch(number) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("fail");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("good");
			break;
		case 9:
		case 10:
			System.out.println("very good");
			break;
		default :
			System.out.println(number + "The number is out of range");
			
		
		
		}
		
		
		
		

	}

}
