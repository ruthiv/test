package b.flow.control.ifDemo;

public class Targil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =(int)(Math.random()*11);
		int b =(int)(Math.random()*11);
		System.out.println(a+ ","+ b);
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		int max = a>b? a:b;
		System.out.println(max);
		

	}

}
