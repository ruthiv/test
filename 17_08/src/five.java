

import java.util.Arrays;

public class five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.Create a class that creates an array[10]
		//of numbers with random values between 0-100
		//and prints the maximum number 
		 int arr[] = new int[10];
	      for (int i=0;i<arr.length ; i++) {
	  		int r = (int)(Math.random()*101);
	  		arr[i] = r;
	  		System.out.print(arr[i]+" , ");
	      }
	      System.out.println();
	      int maxInd = 0;
	      int max1 = 0;
	      for (int i = 0; i < arr.length; i++) {
	    	  if (arr[i] > max1) {
	    		  max1 = arr[i];
	    		  maxInd = i;
			
		}
   	  }
			System.out.println("max" + max1 + "  maxInd" +maxInd);
		} 
	}