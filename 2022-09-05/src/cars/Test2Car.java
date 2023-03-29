package cars;

public class Test2Car {

	public static void main(String[] args) {
		State state = new State("israel");
		state.addHighway(new Highway("A"));
		state.addHighway(new Highway("B"));
		state.addHighway(new Highway("C"));
		state.addHighway(new Highway("D"));
		state.addHighway(new Highway("E"));
		state.getHighways()[0].addCar(new Car(25488, 100));
		state.getHighways()[0].addCar(new Car(58756, 150));
		state.getHighways()[0].addCar(new Car(25846, 80));
		state.getHighways()[1].addCar(new Car(58523, 120));
		state.getHighways()[1].addCar(new Car(25825, 60));
		state.getHighways()[2].addCar(new Car(25888, 180));
		state.getHighways()[2].addCar(new Car(25222, 50));
		state.getHighways()[2].addCar(new Car(25858, 60));
		state.getHighways()[3].addCar(new Car(14787, 180));
		state.getHighways()[3].addCar(new Car(25895, 200));
		state.getHighways()[4].addCar(new Car(25895, 60));
		System.out.println("numbers of cars on highway A is " + state.getNumberOfCars(0));
		System.out.println("The fastest road " + state.getRoadHighway());
		System.out.println("The slowest road " + state.getRoadSlow());

	}

}
