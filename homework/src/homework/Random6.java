package homework;

public class Random6 {

	public static void main(String[] args) {
	//	int a = (int)(Math.random()*101);
	//	System.out.println(a);
	//	int b = 0;
	//while(b<a) {
	//	System.out.println(b);
	//	b++;
	//}
	int x = (int)(Math.random()*101);
	int y = (int)(Math.random()*101);
	int z = 0;
	System.out.println(x +","+ y );
	if(x>y) {
		z =x;
		x = y;
		y = z;
		System.out.println(x +","+ y );
	}
	for(int i = x; i<y; i++) {
		System.out.print(i+ " , ");
	}

	}

}
