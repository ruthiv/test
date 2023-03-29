package homework;

public class TaxCalculator {

	public static void main(String[] args) {
		int tax = (int)(Math.random()*20000);
		if(tax<23000) {
			System.out.println(tax);
			System.out.println(tax/10);
			System.out.println(tax +(tax/10));
			
		} else if(tax<50000){
			System.out.println(tax);
			System.out.println(tax/20);
			System.out.println(tax +(tax/20));
			
		} else if(tax<100000){
			System.out.println(tax);
			System.out.println(tax/30);
			System.out.println(tax +(tax/30));
		}else {
			System.out.println(tax);
			System.out.println(tax/40);
			System.out.println(tax +(tax/40));
		}

	}

}
