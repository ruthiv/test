package homework;

public class RandomLab5 {

	public static void main(String[] args) {
		int a = (int) (Math.random() * 1001);
		System.out.println(a);
		int count = 0;
		while (a > 0) {
			a = a / 10;
			count++;
		}
		System.out.println(count);
		int b = (int) (Math.random() * 1001);
		System.out.println(b);
		System.out.println(b % 10);
		int c = (int) (Math.random() * 1001);
		System.out.println(c);
		while (c >= 10) {
			c = c / 10;

		}
		System.out.println(c);
		int d = (int) (Math.random() * 1001);
		System.out.println(d);
		while (d > 0) {
			System.out.print(d % 10);
			d = d / 10;

		}
		System.out.println();
		int x = (int) (Math.random() * 100001);
		int x1 = x;
		int y = 0;
		System.out.println(x);
		while (x1 > 0) {
			y += x1 % 10;
			x1 = x1 / 10;
			y *= 10;
		}
		y = y / 10;
		if (x == y) {
			System.out.println("The number is palindrome ");
		} else {
			System.out.println("The number isn't palindrome ");
		}
		System.out.println(y);
	}

}
