package homework;

public class Airplane {
	int altitude;
	int direction;
	void goHigher10Yards () {
		altitude+=10;
	}
	void goLower10Yards () {
		altitude-=10;
	}
	void turnNorth () {
		if(direction>0 && direction<90) {
			direction++;
		}else {
			direction =1;
		}
		
	}
	void turnEast () {
		if(direction>90 && direction<180) {
			direction++;
		}else {
			direction =91;
		}
		
	}
	
	void turnSouth () {
		if(direction>180 && direction<270) {
			direction++;
		}else {
			direction =181;
		}
		
	}
	void turnWest () {
		if(direction>270 && direction<360) {
			direction++;
		}else {
			direction =271;
		}
		
	}


}
