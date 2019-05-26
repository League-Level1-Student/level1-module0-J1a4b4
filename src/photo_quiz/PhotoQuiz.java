package photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		
		// 2. create a variable of type "Component" that will hold your image
		Component imageI = createImage("https://i.pinimg.com/originals/fa/7e/d2/fa7ed2daff813c3c08f9442f46a98803.jpg");
		// 3. use the "createImage()" method below to initialize your Component
		
		// 4. add the image to the quiz window
		quizWindow.add(imageI);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answerI = JOptionPane.showInputDialog(null, "Which artist created this?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answerI.equals("M. C. Escher")) {
		System.out.println("CORRECT");
		}else if(answerI.equals("MC Escher")) {
		System.out.println("CORRECT");
		}else {
		System.out.println("INCORRECT");
		System.out.println("The artist was M. C. Escher.");
		}
		// 8. print "INCORRECT" if the answer is wrong
		
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(imageI);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component imageII = createImage("http://mediad.publicbroadcasting.net/p/nhpr/files/styles/x_large/public/201409/5-Escher-Waterfall_0.jpg");
		// 11. add the second image to the quiz window
		quizWindow.add(imageII);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String answerII = JOptionPane.showInputDialog(null, "Is the edge from which the water falls truly above the basin in which it lands?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (answerII.equals("no")) {
		System.out.println("CORRECT");
		}else if(answerII.equals("No")) {
		System.out.println("CORRECT");
		}else {
		System.out.println("INCORRECT");
		}
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
