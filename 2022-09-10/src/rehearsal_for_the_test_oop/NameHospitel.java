package rehearsal_for_the_test_oop;

public enum NameHospitel {
	Soroka(0), poria(1), shiba(2), ziv(3), asota(4), kaplan(5), barzily(6), eichilov(7), hadasa(8), lanido(9);

	private int value = 0;

	private NameHospitel(int value) {
		value++;
	}

	public int getValue() {
		return value;
	}

}
