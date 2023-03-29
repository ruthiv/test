package b.flow.control.ifDemo;

public class Targil1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade =(int)(Math.random()*11);
		
		System.out.println("grade is"+ grade);
		// print verbal grade
		//0-5 Fail
		// 6-8 Good
		// 9-10 Very Good
		if(grade<=5) {
			System.out.println("Fail");
		}else if(grade<=8) {
			System.out.println("Good");
		}else {
			System.out.println("Very Good");
			
		}
			
		

	}

}
