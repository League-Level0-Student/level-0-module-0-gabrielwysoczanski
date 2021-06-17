package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int duo = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		//
		// 2. Ask the user a question
		String yesorno = JOptionPane.showInputDialog("What is the Capital of New Jersey?  ");
		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer was correct, add one to their score
		if (yesorno.equals("Trenton")) {
			JOptionPane.showMessageDialog(null, ("Correct"));
			duo= duo+1;
		}
		else { 
			JOptionPane.showMessageDialog(null, ("Incorrect"));
			duo=duo-1;
		}
			
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
		yesorno = JOptionPane.showInputDialog("Do you know how to play a board game?  Yes or No?");
		if (yesorno.equals("yes")) {
			JOptionPane.showMessageDialog(null, ("-1"));

		}
		// After all the questions have been asked, tell the user their final score
		{
			JOptionPane.showMessageDialog(null, ("Final Score = 0"));

		}
	}

}
