package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obeyRobot {
	static Robot rob = new Robot("mini");
	public static void main(String[] args) {
	
	rob.setSpeed(100);
	
	rob.penDown();
	
	String color = JOptionPane.showInputDialog(" Choose a color, your choices are green, blue, and red");
	
if(color.equalsIgnoreCase("green")) {
		rob.setPenColor(Color.green);
	
	}
	if(color.equalsIgnoreCase("blue")) {
		rob.setPenColor(Color.blue);
	}
	
	if(color.equalsIgnoreCase("red")) {
		
			rob.setPenColor(Color.red);
	}	
	
	String shape= JOptionPane.showInputDialog("CHoose a shape, your choices are square tringle and circle");
	
	if(shape.equalsIgnoreCase("square")) {
		
		drawSquare();
	}
	if(shape.equalsIgnoreCase("triangle")) {
		drawTriangle();
	}
	
	if(shape.equalsIgnoreCase("circle")) {
		drawCircle();
	}
	
	}
	static void drawSquare() {
	
	for(int i =0; i<4; i++ ) {
	
	rob.move(200);
	
	rob.turn(90);
	}
	

	}
	static void drawTriangle() {
		
		rob.turn(30);
		
		for(int i = 0; i<3; i++) {
			rob.move(200);
			rob.turn(120);
			
		}
		
	}
	static void drawCircle() {
		
		for(int i =0; i<360; i++) {
rob.move(1);
rob.turn(1);
		}
		
		
		
	}
}
	


	