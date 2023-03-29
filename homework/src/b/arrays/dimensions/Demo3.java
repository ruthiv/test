package b.arrays.dimensions;

public class Demo3 {

	public static void main(String[] args) {
	int [][] color = new int [10] [3];
	for (int i = 0; i < color.length; i++) {
		for (int j = 0; j < color[i].length; j++) {
			color[i][j]= (int)(Math.random()*256);
		}
		
	}

	}

}
