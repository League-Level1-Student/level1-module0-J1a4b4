package cuteness_tv;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
JButton ducks = new JButton();
JButton frogs = new JButton();
JButton unicorns = new JButton();
public void channels() {
JFrame frame = new JFrame();
JPanel panel = new JPanel();
frame.setVisible(true);
frame.add(panel);
ducks.setText("Duck Vids");
frogs.setText("Frog Vids");
unicorns.setText("Unicorn Vids");
ducks.addActionListener(this);
frogs.addActionListener(this);
unicorns.addActionListener(this);
panel.add(ducks);
panel.add(frogs);
panel.add(unicorns);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton channel = (JButton) e.getSource();
	if (channel == ducks) {
	showDucks();
	}else if (channel == frogs) {
	showFrog();
	}else if (channel == unicorns) {
	showFluffyUnicorns();
	}
}
void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}
