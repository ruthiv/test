package oop_test_preparation_exercise;

public abstract class Product {

	private String name;
	private double price;
	private int counter = 123456789;
	private final int barcode = counter++;

	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name: " + name + ", price=" + price + ", barcode=" + barcode;
	}

}
