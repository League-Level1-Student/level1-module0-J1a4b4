package duelling_buttons;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {
	int leftClicks = 0;
	int rightClicks = 0;
	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	public void run() {

		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the leftButton to "Click me!"
		leftButton.setText("Click me!");
		// 4. Set the text of the rightButton to "Click me!"
		rightButton.setText("Click me!");
		// 5. Add an action listener to the leftButton
		leftButton.addActionListener(this);
		// 6. Add an action listener to the rightButton
		rightButton.addActionListener(this);
		// 7. Add the leftButton to the panel
		leftButton.setPreferredSize(SMALL);
		panel.add(leftButton);
		// 8. Add the rightButton to the panel
		rightButton.setPreferredSize(SMALL);
		panel.add(rightButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Demanding Buttons");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		/* If the buttonPressed was the leftButton.... */
		// Set the text of the rightButton to "No, click Me!"
		// Set the PREFERRED size of the rightButton to BIG
		// Set the text of the leftButton to "Click Me!"
		// Set the PREFERRED size of the leftButton to SMALL
		if(buttonPressed.equals(leftButton)) {
		rightButton.setText("No, click me!");
		rightButton.setPreferredSize(BIG);
		leftButton.setText("Click me!");
		leftButton.setPreferredSize(SMALL);
		rightClicks = 0;
		leftClicks = leftClicks + 1;
		if(leftClicks > 2) {
		rightButton.setText("Hmmph.");
		rightButton.setPreferredSize(SMALL);
		}else if(leftClicks > 1) {
		rightButton.setText("Jerk!");
		}
		}else if(buttonPressed.equals(rightButton)) {
		leftButton.setText("No, click me!");
		leftButton.setPreferredSize(BIG);
		rightButton.setText("Click me!");
		rightButton.setPreferredSize(SMALL);
		leftClicks = 0;
		rightClicks = rightClicks + 1;
		if(rightClicks > 2) {
		leftButton.setText("Hmmph.");
		leftButton.setPreferredSize(SMALL);
		}else if(rightClicks > 1) {
		leftButton.setText("Jerk!");
		}
		}
		/* If the buttonPressed was the rightButton, do the opposite. */

		frame.pack();
	}
}
