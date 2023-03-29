package d;

public class Demo1 {

	public static void main(String[] args) {
		for(int i = 0; i<=20; i+=2) {
			System.out.println(i);
		}
  System.out.println("____________________");
      for(char a = 'A'; a<='Z'; a++) {
		System.out.println(a + " : "+ (int)a);
	  }
      System.out.println("____________________");
      for(int a = 1, b=10; a<=10; a++ , b--) {
    	  System.out.println(a+ "  - "+ b);
      }
  
	}

}
