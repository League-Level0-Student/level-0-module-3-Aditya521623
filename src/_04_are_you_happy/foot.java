package _04_are_you_happy;

import javax.swing.JOptionPane;

public class foot {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Are you happy");
		
		if(input.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null,"Keep doing whatever you are doing.");
		}
		else
		{
			String input2 = JOptionPane.showInputDialog("Do you want to be happy?");
			
			if(input2.equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null,"Change something");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Keep doing whatever you are doing.");
			}
			}
		}
	}


