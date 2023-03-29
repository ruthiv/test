package homework;

public class SalaryRaiser {

	public static void main(String[] args) {
		int salary = (int)((Math.random()*1001)+5000);
		System.out.println(salary);
		if((salary+(salary/10))<6000) {
			System.out.println(salary+(salary/10));
		}else {
			System.out.println(salary+(salary/5));
		}

	}

}
