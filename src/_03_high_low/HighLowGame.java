//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100) + 1;
		for (int i = 0; i < 5; i++) {

			
			// 2. Print out the random variable above
			
			// 11. Repeat steps 1 to 10 ten times

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String input = JOptionPane.showInputDialog("Please guess my number from one to one hundered");

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int number = Integer.parseInt(input);
			// 5. if the guess is correct
			if (number == random) {
				JOptionPane.showMessageDialog(null, "COrrect");
				System.exit(0);
			}
			// 6. Win
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right
			// answer.
			if (number < random) {
				JOptionPane.showMessageDialog(null, " your guess is too low");
			}
			// 7. if the guess is high
			// 8. Tell them it's too high
			if (number > random) {
				JOptionPane.showMessageDialog(null, "Your gues is too high");
			}

			
		}
		
		JOptionPane.showMessageDialog(null, "You lose, loser.");
		
		JOptionPane.showMessageDialog(null, "Ze numero is" + random);
	}

}
