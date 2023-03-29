package oop_test_preparation_exercise;

import oop_test_preparation_exercise.Food.Foods;

public class TestFood {

	public static void main(String[] args) {
		Food[] foods = new Food[400];
		Food agg = new Food("agg", 30.2, Foods.BASIC);
		Food milk = new Food("milk", 6.2, Foods.BASIC);
		Food bread = new Food("bread", 5.9, Foods.BASIC);
//		agg.addFood(agg);
//		milk.addFood(milk);
//		bread.addFood(bread);

		System.out.println("===========");

		System.out.println(agg);
		System.out.println(milk);
		System.out.println(bread);

	}

}
