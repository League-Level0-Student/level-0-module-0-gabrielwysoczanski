package _03_print_and_popups._5_awesome_or_not;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes everything below

	public static void main(String[] args) {
		
	
		Random ran = new Random();    //This will be used below to make a random number. 
		
		// 2. Make a variable that will hold a random whole number
	int whole;
		// 3. Set your variable equal to a positive number less than 4 using     ran.nextInt(4); 
	whole=ran.nextInt(3); 
		// 3. Print your variable to the console
	System.out.println(whole);
		// 4. Get the user to enter something that they think is awesome
	String adjective = JOptionPane.showInputDialog("Write something awesome");
		// 5. If your variable is  0
	
			// -- tell the user whatever they entered is awesome!
	if (whole==0) {
		JOptionPane.showMessageDialog(null, (adjective+" Is Awesome"));
	}		
		// 6. If your variable is  1
	
			// -- tell the user whatever they entered is ok.
	if (whole==1) {
		JOptionPane.showMessageDialog(null, (adjective+" Is ok"));
	}
		// 7. If your variable is  2
	
			// -- tell the user whatever they entered is boring.
	if (whole==2) {
		JOptionPane.showMessageDialog(null, (adjective+" Is boring"));
	}
		// 8. If your variable is  3
	if (whole==3) {
		JOptionPane.showMessageDialog(null, (adjective+" Please be nice"));
	}
			// -- invent your own message to give to the user (be nice).
	}
}
