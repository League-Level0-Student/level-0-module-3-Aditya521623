//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
				Robot rob = new Robot();
				rob.setSpeed(100);
				
				for(int i = 0; i<5; i++) {
					
				
		
		String input = JOptionPane.showInputDialog("what would you like the color to be. Your choices are green, red, and blue. ");
		
	
	
if(input.equalsIgnoreCase("green")) {
	rob.setPenColor(Color.green);
}
else if(input.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
else if(input.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.blue);
}
else
{
	rob.setRandomPenColor();
}

        
	rob.setPenWidth(10);
		

		rob.penDown();
		for(int j = 0; j<4; j++) {
			rob.move(200);

			rob.turn(90);
		}
		}

	}
}
