package homework;

import java.util.Scanner;

public class SalaryRaiser2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary");
		double salary= sc.nextDouble();
		double tax = 0D;
		sc.close();
		System.out.println(salary);
		if(salary<=23_000) {
			tax = salary*0.1;
		}else {
			tax = 23_000*0.1;
			if(salary<=50_000) {
			tax+= (salary-23_000)*0.2;	
			}else {
				tax+=(salary-50_000)*0.2;
			}
			   if (salary<= 100_000) {
				   tax+=(salary-50_000)*0.3;
			   }
			   else {
				   tax+=50_000*0.3; 
				   tax+=(salary-100_000)*0.4;
			   }
		}
		System.out.println(salary +"₪");
		System.out.println(tax);
		System.out.println(salary-tax+"₪");

	}

}
