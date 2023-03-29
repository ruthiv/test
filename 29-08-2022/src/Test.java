import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Orange[] o = new Orange[100];
		for (int i = 0; i < o.length; i++) {
			o[i] = new Orange((int) (Math.random() * 3) + 3);
		}
		System.out.println(Arrays.toString(o));
		Orange[] small = new Orange[100];
		Orange[] med = new Orange[100];
		Orange[] big = new Orange[100];
		int a = 0, b = 0, c = 0;
		for (int i = 0; i < o.length; i++) {
			if (o[i].getSize() == 3) {
				small[a++] = o[i];
			} else if (o[i].getSize() == 4) {
				med[b++] = o[i];
			} else {
				big[c++] = o[i];
			}
		}

		System.out.println(Arrays.toString(small));
		System.out.println(Arrays.toString(med));
		System.out.println(Arrays.toString(big));

	}

}
