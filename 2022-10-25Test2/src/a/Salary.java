package a;

public class Salary {

	private double amount;
	private int yearlyBonus;

	public Salary() {
		this.amount = (Math.random() * 49001) + 1000;
		this.yearlyBonus = (int) (Math.random() * 10001);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getYearlyBonus() {
		return yearlyBonus;
	}

	public void setYearlyBonus(int yearlyBonus) {
		this.yearlyBonus = yearlyBonus;
	}

	@Override
	public String toString() {
		return "Salary: amount= " + amount + ", yearlyBonus= " + yearlyBonus;
	}

}
