package homework;

public class Lab7 {

	public static void main(String[] args) {
		char[] arr = { 'a', 'b', 'c', 'a', 'b', 'd', 'r', 'c' };
		int count = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				count++;
			}
			if (arr[i] == 'c') {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count + count2);

		String st = new String("John Bryce");
		char[] John = st.toCharArray();
		System.out.println(John);
		int a = 0;
		for (int i = 0; i < John.length; i++) {
			if (John[i] == 'h') {
				a++;
			}
		}
		System.out.println("The array has  " + a + " h.");
		String str = "Sara Shara Shir Cameach";
		char[] sara = str.toCharArray();
		int b = 0;
		for (int i = 0; i < sara.length; i++) {
			if (sara[i] == 'a' || sara[i] == 'h' || sara[i] == 'i' || sara[i] == 'o' || sara[i] == 'u') {
				b++;
			}
		}
		System.out.println("The array has  " + b);

	}

}
