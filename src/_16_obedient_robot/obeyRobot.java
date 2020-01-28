package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class obeyRobot {
	static Robot rob = new Robot();
	public static void main(String[] args) {
	
	rob.setSpeed(50);
	
	rob.penDown();
	
	drawCircle();
	
	}
	static void drawSquare() {
	
	for(int i =0; i<4; i++ ) {
	
	rob.move(200);
	
	rob.turn(90);
	}
	

	}
	static void drawTrinagle() {
		
		rob.turn(30);
		
		for(int i = 0; i<3; i++) {
			rob.move(200);
			rob.turn(120);
			
		}
		
	}
	static void drawCircle() {
		
		for(int i =0; i<360; i++) {
			rob.turn(1);
			rob.move(360);
		}
		
		
		
	}
}
	


	