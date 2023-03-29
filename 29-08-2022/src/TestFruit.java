import java.util.Arrays;

public class TestFruit {
	public static void main(String[] args) {
		FruitFactory f = new FruitFactory();
		f.add(new Apple(3));
		f.add(new Apple(4));
		f.add(new Peach(5));
		f.add(new Peach(4));
		f.add(new Peach(3));
		f.add(new Peach(5));
		f.add(new Orange(3));
		f.add(new Apple(3));
		System.out.println(Arrays.toString(f.getmedApple()));

	}
}
