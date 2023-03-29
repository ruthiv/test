package homework;

public class Random5 {

	public static void main(String[] args) {
		int number1 = (int)(Math.random()*101);
		int number2 = (int)(Math.random()*101);
		int number3 = (int)(Math.random()*101);
		int number4 = (int)(Math.random()*101);
		int number5 = (int)(Math.random()*101);
		System.out.println(number1 + ","+ number2+ ","+ number3 + ","+ number4+","+number5);
		int max = number1;
		if(max> number2) {
			max = number2;
		}
		if(max> number3) {
			max = number3;
		}
		if(max> number4) {
			max = number4;
		}
		if(max> number5) {
			max = number5;
		}
		System.out.println(max);
	}

}
