
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 13th";
		String dadsBirthday = "October 7th";
		String myBirthday = "January 12th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String input = JOptionPane.showInputDialog("Choose to type in my moms birthday, my dad's bithday, or my bithday. Type mom, dad, or me.");
		// 3. Print out what the user typed
		
		// 4. if user asked for "mom"
	if(input.equalsIgnoreCase("mom")) {
		JOptionPane.showMessageDialog(null,momsBirthday);
	}
	
	else if(input.equalsIgnoreCase("dad")) {
		JOptionPane.showMessageDialog(null,dadsBirthday);
	}
		
	else if(input.equalsIgnoreCase("me")) {
		JOptionPane.showMessageDialog(null,myBirthday);
	}
	
	else
	{
		JOptionPane.showMessageDialog(null,"Sorry, i don't remember that person's birthday!");
	}
	
		
	
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
