package ifs_ints_and_loops;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	String date ;
	 date = JOptionPane.showInputDialog("When is your birthday?");
	if (date.equals("12/23")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday!");
	}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday...");
		}
	}
	} 

	


