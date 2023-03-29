package homework;

public class Random4_5 {

	public static void main(String[] args) {
		//int x = (int)(Math.random()*101);
		//System.out.println(x);
		//for(int i = 0; i< x ; i+=2) {
			//System.out.print(i+ " , ");
		//}
		int a = (int)(Math.random()*101);
		int b = (int)(Math.random()*10);
		System.out.println(a+","+ b);
		for(int i = 0; i< a ; i++) {
			if(i%b==0) {
				System.out.print(i+ " , ");
			}
			
		}
		System.out.println();
		int y = (int)(Math.random()*7)+1;
		System.out.print("["+ y+"-");
		for(int z=1; z<y;z++) {
			System.out.print(z+"x");
		}System.out.print(y+"]");

	}

}
