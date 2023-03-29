package e.car;

public class PointTest {

	public static void main(String[] args) {
		Point point = new Point();
		System.out.println("("+point.x + ","+ point.y+ ")");
		for(int y = 0; y<3; y++) {
					point.moveUp();
		}
		for(int x =0; x<5; x++){
			point.moveRight();
		}
			
		System.out.println("("+point.x + ","+ point.y+ ")");
		
		

	}

}
