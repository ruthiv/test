package a;

public class CompanyStatistics {

	public static void main(String[] args) {
		Company company = new Company();
		System.out.println(company);
		TotalAvgSalary(company);
		AvgSalaryOfEachDepartment(company);
		AvgBonusOfEachDepartment(company);
		avgSalaryOfManager(company);
		avgBonusOfManager(company);
		TotalAvgAge(company);
		numberEmployee20_30(company);
		numberEmployee31up(company);
	}

	public static void TotalAvgSalary(Company company) {
		int count = 0;
		double salary = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			++count;
			salary += (company.getDepartments()[i].getManager().getSalary().getAmount());
			// + company.getDepartments()[i].getManager().getSalary().getYearlyBonus());
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				++count;
				salary += (company.getDepartments()[i].getEmployees()[j].getSalary().getAmount());
				// + company.getDepartments()[i].getEmployees()[j].getSalary().getYearlyBonus();
			}
		}
		System.out.println("Total Avg Salary: " + salary / count);
	}

	public static void AvgSalaryOfEachDepartment(Company company) {
		int count = 0;
		double salary = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			++count;
			salary += (company.getDepartments()[i].getManager().getSalary().getAmount());
			// + company.getDepartments()[i].getManager().getSalary().getYearlyBonus());
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				++count;
				salary += (company.getDepartments()[i].getEmployees()[j].getSalary().getAmount());
				// + company.getDepartments()[i].getEmployees()[j].getSalary().getYearlyBonus();
			}
			System.out.println("Avg Salary Of " + company.getDepartments()[i].getName() + ":  \t" + salary / count);
			count = 0;
			salary = 0;
		}

	}

	public static void AvgBonusOfEachDepartment(Company company) {
		int count = 0;
		double bonus = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			++count;
			bonus += company.getDepartments()[i].getManager().getSalary().getYearlyBonus();
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				++count;
				bonus += company.getDepartments()[i].getEmployees()[j].getSalary().getYearlyBonus();
			}
			System.out.println("Avg bonus Of " + company.getDepartments()[i].getName() + ":  \t" + bonus / count);
			count = 0;
			bonus = 0;
		}

	}

	public static void avgSalaryOfManager(Company company) {
		double salary = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			salary += company.getDepartments()[i].getManager().getSalary().getAmount();
		}
		System.out.println("avg Salary Of Manager  " + salary / company.getDepartments().length);
	}

	public static void avgBonusOfManager(Company company) {
		double bonus = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			bonus += company.getDepartments()[i].getManager().getSalary().getYearlyBonus();
		}
		System.out.println("avg Bonus Of Manager  " + bonus / company.getDepartments().length);
	}

	public static void TotalAvgAge(Company company) {
		int count = 0;
		int age = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			++count;
			age += company.getDepartments()[i].getManager().getAge();
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				++count;
				age += company.getDepartments()[i].getEmployees()[j].getAge();
			}
		}
		System.out.println("Total Avg Age " + age / count);
	}

	public static void numberEmployee20_30(Company company) {
		int age = 0, count = 0;
		double salary = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				if (company.getDepartments()[i].getEmployees()[j].getAge() >= 20
						&& company.getDepartments()[i].getEmployees()[j].getAge() <= 30) {
					age += company.getDepartments()[i].getEmployees()[j].getAge();
					++count;
					salary += company.getDepartments()[i].getEmployees()[j].getSalary().getAmount();
				}
			}

		}
		System.out.println("number Employee 20-30 " + "avg salary: " + salary / count + "\tavg age: " + age / count);
	}

	public static void numberEmployee31up(Company company) {
		int age = 0, count = 0;
		double salary = 0;
		for (int i = 0; i < company.getDepartments().length; i++) {
			for (int j = 0; j < company.getDepartments()[i].getEmployees().length; j++) {
				if (company.getDepartments()[i].getEmployees()[j].getAge() >= 31) {
					age += company.getDepartments()[i].getEmployees()[j].getAge();
					++count;
					salary += company.getDepartments()[i].getEmployees()[j].getSalary().getAmount();
				}
			}

		}
		System.out.println("number Employee 31 up " + "avg salary: " + salary / count + "\tavg age: " + age / count);
	}
}
