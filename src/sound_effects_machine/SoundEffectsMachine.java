package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
JButton seagull = new JButton();
JButton gunshot = new JButton();
JButton bell = new JButton();
public void buttonPanel() {
JFrame frame = new JFrame();
frame.setVisible(true);
JPanel panel = new JPanel();
seagull.setText("Seagulls");
gunshot.setText("Gunshot");
bell.setText("Bell");
seagull.addActionListener(this);
gunshot.addActionListener(this);
bell.addActionListener(this);
panel.add(seagull);
panel.add(gunshot);
panel.add(bell);
frame.add(panel);
frame.pack();
}
@Override
public void actionPerformed(ActionEvent e) {
	JButton label = (JButton) e.getSource();
	if (label.equals(seagull)) {
	playSound("Seagulls.wav");
	}else if (label.equals(gunshot)) {
	playSound("Gunshot.wav");
	}else if (label.equals(bell)) {
	playSound("Bell.wav");
	}
	
}
private void playSound(String string) {
	AudioClip sound = JApplet.newAudioClip(getClass().getResource(string));
	sound.play();
	
}
}
