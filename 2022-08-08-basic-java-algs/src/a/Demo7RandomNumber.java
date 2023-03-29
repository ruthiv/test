package a;

public class Demo7RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Math.random()); 
		System.out.println((int)(Math.random()*11));
		//a[0-100]
		int a =(int)(Math.random()*101);
		System.out.println(a);
		//b[0-5]
		int b =(int)(Math.random()*6);
		System.out.println(b);
		// c[10-20]
		int c =(int)(Math.random()*11 + 10);
		System.out.println(c);
		//d[15-200,000]
		int low = -1;
		int high = 12;
		
		int d =(int)(Math.random()*(high-low+1))+ low;
		System.out.println(d);
		
	}

}
