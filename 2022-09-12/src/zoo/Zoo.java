package zoo;

import java.util.Arrays;

import c.Animals;
import c.Bird;
import c.Insect;
import c.Mammal;
import interfaces.Flyer;

public class Zoo {
	Flyer[] flyers = new Flyer[10];
	Mammal[] mammals = new Mammal[10];
	Bird[] birds = new Bird[10];
	Insect[] insects = new Insect[10];
	int f = 0, m = 0, b = 0, i = 0;

	public void addAnimal(Animals animal) {
		if (animal instanceof Flyer) {
			// animal.getClass().getSimpleName();
			Flyer flyer = (Flyer) animal;
			flyers[f++] = flyer;

		} else if (animal instanceof Mammal) {
			if (mammals[m] != null) {
				mammals[m++] = (Mammal) animal;

			}
		} else if (animal instanceof Bird) {
			birds[b++] = (Bird) animal;
		} else if (animal instanceof Insect) {
			insects[i++] = (Insect) animal;
		}
	}

	public Flyer[] getFlyers() {
		Flyer[] flyersEzer = new Flyer[f];
		System.arraycopy(flyers, 0, flyersEzer, 0, f);
		return flyersEzer;

	}

	public Mammal[] getMammals() {
		Mammal[] mammalsAll = new Mammal[20];
		System.arraycopy(this.mammals, 0, mammalsAll, 0, m);
		int ind = m;
		for (Flyer flyer : flyers) {
			if (flyer instanceof Mammal) {
				mammalsAll[ind++] = (Mammal) flyer;
			}
		}
		Mammal[] mammalsShort = new Mammal[ind];
		System.arraycopy(mammalsAll, 0, mammalsShort, 0, ind);

		return mammalsShort;
	}

	public Bird[] getBirds() {
		for (int i = 0; i < flyers.length; i++) {
			if (flyers[i] instanceof Bird) {
				birds[b++] = (Bird) flyers[i];
			}
		}
		return birds;
	}

	public Insect[] getInsects() {
		for (int i = 0; i < flyers.length; i++) {
			if (flyers[i] instanceof Insect) {
				insects[this.i++] = (Insect) flyers[i];
			}
		}
		return insects;
	}

	@Override
	public String toString() {
		return "Zoo: \n Flyers" + Arrays.toString(getFlyers()) + "\n Mammals" + Arrays.toString(getMammals())
				+ "\n Birds" + Arrays.toString(getBirds()) + "\n Insects" + Arrays.toString(getInsects());
	}

}
