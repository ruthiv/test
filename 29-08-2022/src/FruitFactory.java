
public class FruitFactory {

	private Orange[][] o = new Orange[3][25];
	private Apple[][] a = new Apple[3][25];
	private Peach[][] p = new Peach[3][25];
	int o1 = 0, a1 = 0, p1 = 0;
	int o2 = 0, a2 = 0, p2 = 0;
	int o3 = 0, a3 = 0, p3 = 0;

	public void add(Fruit f) {
		if (f instanceof Orange) {
			if (f.getSize() == 3) {
				o[0][o1++] = (Orange) f;
			} else if (f.getSize() == 4) {
				o[1][o2++] = (Orange) f;
			} else {
				o[2][o3++] = (Orange) f;
			}
		} else if (f instanceof Apple) {
			if (f.getSize() == 3) {
				a[0][a1++] = (Apple) f;
			} else if (f.getSize() == 4) {
				a[1][a2++] = (Apple) f;
			} else {
				a[2][a3++] = (Apple) f;
			}
		} else {
			if (f.getSize() == 3) {
				p[0][p1++] = (Peach) f;
			} else if (f.getSize() == 4) {
				p[1][p2++] = (Peach) f;
			} else {
				p[2][p3++] = (Peach) f;
			}
		}

	}

	public Orange[] getSmalOranges() {
		return o[0];
	}

	public Orange[] getmedOranges() {
		return o[1];
	}

	public Orange[] getbigOranges() {
		return o[2];
	}

	public Peach[] getSmalPeach() {
		return p[0];
	}

	public Peach[] getmedPeach() {
		return p[1];
	}

	public Peach[] getbigPeach() {
		return p[2];
	}

	public Apple[] getSmalApple() {
		return a[0];
	}

	public Apple[] getmedApple() {
		return a[1];
	}

	public Apple[] getbigApple() {
		return a[2];
	}

}
