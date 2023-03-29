
public class Boom {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			int a = i;
			while (a > 0) {
				if (a % 10 == 7) {
					a = -1;
				} else {
					a /= 10;
				}

			}
			if (i % 7 == 0 || a == -1) {
				System.out.print("BOOM" + " , ");
			} else {
				System.out.print(i + " , ");
			}

		}

	}
}