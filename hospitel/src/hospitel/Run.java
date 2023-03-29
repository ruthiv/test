package hospitel;

import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		Hospitel hospitel = new Hospitel();
		System.out.println(hospitel);
		HospitelSatistics.count(hospitel);
		HospitelSatistics.avgDisease(hospitel);
		HospitelSatistics.avgAllDisease(hospitel);
		System.out.println(Arrays.toString(HospitelSatistics.countDisease(hospitel)));

	}

}
