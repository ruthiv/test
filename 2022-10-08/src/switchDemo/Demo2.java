package switchDemo;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mode: [off,on,low,medium,high]");
		String mode = sc.nextLine();
		sc.close();
	
		switch(mode) {
		case "off":
			System.out.println("turn over off");
			break;
		case "on":
			System.out.println("turn over on");
			break;
		case "low":
			System.out.println("turn over low");
			break;
		case "medium":
			System.out.println("turn over medium");
			break;
		case "high":
			System.out.println("turn over high");
			break;
		default :
			System.out.println(mode + "is not supported");
			
		
		}
		
		
		
		

	}

}
