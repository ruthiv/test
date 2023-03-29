
public class MultiDim {

	public static void main(String[] args) {
		int [][] arr = new int [5][];
		arr[0] = new int [3];
		arr[1] = new int [10];
		arr[2] = new int [2];
		arr[3] = new int [5];
		arr[4] = new int [9];
		int[][] arr2 = {{1,1,1},{2,2},{3,3,9},{1}};
		int [][]arr3 = new int[3][];
		for(int i=0; i<arr.length; i++) {
			int length = (int)(Math.random()*10)+3;
			arr[i]= new int[length];
		}
		
	}

}
