package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton() {
JFrame frame = new JFrame();
frame.setVisible(true);
frame.setTitle("Fortune Cookie Sans Cookie");
JButton button = new JButton();
button.addActionListener(this);
frame.add(button);
frame.pack();
}

@Override
public void actionPerformed(ActionEvent e) {
	Random randy = new Random();
	int randNum = randy.nextInt(5);
	if (randNum == 0) {
	JOptionPane.showMessageDialog(null, "You will click the button again.");
	}else if (randNum == 1) {
	JOptionPane.showMessageDialog(null, "You will be disappointed that you did not get a cookie.");
	}else if (randNum == 2) {
	JOptionPane.showMessageDialog(null, "You will leave $5 on the keyboard.");
	}else if (randNum == 3) {
	JOptionPane.showMessageDialog(null, "You will feel an inexplicable urge to eat a cookie.");
	}else if (randNum == 4) {
	JOptionPane.showMessageDialog(null, "You will become very rich.  Then, you will give all of your money to me.");
	}
	
}
}
