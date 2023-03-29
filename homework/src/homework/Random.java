package homework;

public class Random {

	public static void main(String[] args) {
		int a = (int)(Math.random()*250)+101;
		int b = (int)(Math.random()*250)+101;
		System.out.println(a + ","+ b);
		if(a>b) {
			System.out.println(a);
			
		}else{
			System.out.println(b); 	
		}
				
		int c = (int)(Math.random()*101);
		System.out.println(c);
		if(c>50) {
			System.out.println("Big!");
			
		}else if(c<50) {
			System.out.println("small!");
		}else {
			System.out.println("Bingo!");
		}
		
		int d = (int)(Math.random()*101);
		System.out.println(d);
		if(d>=0 && d<=50) {
			System.out.println("small!");
		}else {
			System.out.println("big!");
		}
		if(d%2==0) {
			System.out.println("ever");
		}else {
			System.out.println("add");
		}
		//
		int number1 = (int)(Math.random()*101);
		int number2 = (int)(Math.random()*101);
		int number3 = (int)(Math.random()*101);
		System.out.println(number1 + ","+ number2+ ","+ number3);
		if(number1> number2 && number1> number3) {
			System.out.println(number1);
			
		}else if(number2> number1 && number2> number3) {
			System.out.println(number2);
		}else {
			System.out.println(number3);
		}
		//
		int year = (int)(Math.random()*2022);
		if(((year%4==0) && (year%100!=0))  || (year %400 == 0)){
			System.out.println(year + " The year is leap year");
		}else{
			System.out.println(year + " The year is not leap year");
		}

	}

}
