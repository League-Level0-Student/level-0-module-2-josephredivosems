//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
public static void main(String[] args) {
	

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
	int magic = 0;
    Random ran = new Random();
    magic = ran.nextInt(4);
	// 3. Print out this variable
	System.out.println(magic);
	// 4. Get the user to enter a question for the 8 ball
	JOptionPane.showInputDialog("Enter a question for the 8 ball.");
	// 5. If the random number is 0
	if(magic == 0) {
	// -- tell the user "Yes"
    JOptionPane.showMessageDialog(null, "Yes.");
	}
	// 6. If the random number is 1
	else if(magic == 1) {
	// -- tell the user "No"
JOptionPane.showMessageDialog(null, "NO.");
	}
	// 7. If the random number is 2
	else if(magic == 2) {
	// -- tell the user "Maybe you should ask Google?"
	JOptionPane.showMessageDialog(null, "Maybe you should ask Google, nerd.");
	}
	// 8. If the random number is 3
	else {
	// -- write your own answer
		JOptionPane.showMessageDialog(null, "Listen, I don't have time to answer your question?");
	}
}
}