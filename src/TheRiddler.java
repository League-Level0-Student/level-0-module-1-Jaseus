//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;
public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
				int score = 0;
				String riddle = "A coin";
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
				String answer = JOptionPane.showInputDialog("What has a head and a tail, but no body?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
				if(answer.equalsIgnoreCase("A coin")) {
					score = score + 1;
					JOptionPane.showMessageDialog(null, "Correct!");
				
		// 5. Otherwise, say "wrong" and tell them the answer
				}else {
					JOptionPane.showMessageDialog(null, "INCORRECT. " + riddle + " was the answer.");
				}
				JOptionPane.showMessageDialog(null, "Your score is " + "'" + score + "'");
		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

