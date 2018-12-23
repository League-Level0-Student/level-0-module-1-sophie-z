package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int playerscore = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String answerone = ""
			+ "Incorrectly. ";
			String one = JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(one.equals(answerone)) {
JOptionPane.showMessageDialog(null, "Correct! This is your current score: " + playerscore);
playerscore = playerscore + 1;
		// 5. Otherwise, say "wrong" and tell them the answer
} else {
	JOptionPane.showMessageDialog(null, "WRONG! Here is the answer: " + answerone + "This is your current score: " + playerscore);
}
		// 6. Add some more riddles
	String answertwo = " Your breath."; 
	String two = JOptionPane.showInputDialog("What is as lighter than a feather, but even the world's strongest man couldn't hold it for more than 10 minutes?");
	if(two.equals(answertwo)) {
		JOptionPane.showMessageDialog(null, "Correct! This is your current score: " + playerscore);
		playerscore = playerscore + 1;
	
	} else {
		JOptionPane.showMessageDialog(null, "WRONG! Here is the answer:" + answertwo + " This is your current score: " + playerscore);
	}
	// 2. Make a pop up to show the score.
		
}
	}

