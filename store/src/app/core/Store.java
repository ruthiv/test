package app.core;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String shop = " zara ";
		String Address = " Petah Tikva ";
		String product1 = " shirt ";
		String product2 = " pants ";
		String product3 = " dress ";
		String product4 = " shoes ";
		String product5 = " hat ";
		double price1 = 220;
		double price2 = 50;
		double price3 = 120.5;
		double price4 = 580.90;
		double price5 = 360;
		double sum ;
		
		System.out.println(Address + "בכתובת"+ shop +"בחנות");
		System.out.println(product1 + price1);
		System.out.println(product2 + price3);
		System.out.println(product3 + price4);
		System.out.println(product4 + price5);
		System.out.println(product5 + price2);
		System.out.println(sum=(price2+price1+price3+price4+price5)/5);
	

	}

}
