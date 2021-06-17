package _03_print_and_popups._3_world_domination;


import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		
		// 1. Ask the user if they know how to write code.
		String yesorno= JOptionPane.showInputDialog ("Do you know how to write code?  Yes or No?");
		// 2. If they say "yes", tell them they will rule the world.
if(yesorno .equals("yes")){ 
	JOptionPane.showMessageDialog(null,"Rule the World!!! "); 
	
}
		// 3. Otherwise, tell them to sign up for classes at The League.
if(yesorno.equals("no")) {
	JOptionPane.showMessageDialog(null,"Sign Up for classes at The League!!! ");

}
	}
}

