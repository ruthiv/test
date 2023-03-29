import javax.swing.JOptionPane;

public class Demo1Wrappers {

	public static void main(String[] args) {
		int x = 5;
		Integer a = 5;

		double y = 5.32;
		Double b = 5.32;

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		System.out.println("=================");
		String userInput = JOptionPane.showInputDialog("Enter a number");
		System.out.println(userInput);
		int val = Integer.parseInt(userInput);

	}

}
