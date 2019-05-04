import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
static int xPos = 10;
	public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	String inputI = JOptionPane.showInputDialog(null, "How tall would you like the house to be? (small, medium, or large)");
	String inputII = JOptionPane.showInputDialog(null, "What color?");
	String inputIII = JOptionPane.showInputDialog(null, "How tall would you like the house to be? (small, medium, or large)");
	String inputIV = JOptionPane.showInputDialog(null, "What color?");drawFlatHouse(xPos, inputI, inputII);
	drawFlatHouse(xPos, inputI, inputII);
	drawPeakedHouse(xPos, inputIII, inputIV);
	}
	}
static void drawFlatHouse(int startingPoint, String houseHeight, String color) {
	int height = 0;
	if (houseHeight.equals("small")) {
	height = 60;
	}else if (houseHeight.equals("medium")) {
	height = 120;
	}else if (houseHeight.equals("large")) {
	height = 250;
	}
	Robot randolf = new Robot();
	randolf.setSpeed(100);
	randolf.miniaturize();
	randolf.penDown();
	randolf.setPenWidth(5);
	randolf.setX(startingPoint);
	if (color.equals("red")) {
	randolf.setPenColor(Color.red);
	}else if (color.equals("blue")) {
	randolf.setPenColor(Color.blue);
	}else if (color.equals("yellow")) {
	randolf.setPenColor(Color.yellow);
	}else if (color.equals("green")) {
	randolf.setPenColor(Color.green);
	}else if (color.equals("pink")) {
	randolf.setPenColor(Color.pink);
	}else if (color.equals("black")) {
	randolf.setPenColor(Color.black);
	}
	randolf.move(height);
	randolf.turn(90);
	randolf.move(12);
	randolf.turn(90);
	randolf.move(height);
	randolf.turn(270);
	randolf.move(6);
	randolf.setPenColor(0, 150, 0);
	randolf.move(25);
	xPos = xPos + 51;
	randolf.hide();
}
static void drawPeakedHouse(int startingPoint, String houseHeight, String color) {
	int height = 0;
	if (houseHeight.equals("small")) {
	height = 60;
	}else if (houseHeight.equals("medium")) {
	height = 120;
	}
	Robot randolf = new Robot();
	randolf.setSpeed(100);
	randolf.miniaturize();
	randolf.penDown();
	randolf.setPenWidth(5);
	randolf.setX(startingPoint);
	if (color.equals("red")) {
	randolf.setPenColor(Color.red);
	}else if (color.equals("blue")) {
	randolf.setPenColor(Color.blue);
	}else if (color.equals("yellow")) {
	randolf.setPenColor(Color.yellow);
	}else if (color.equals("green")) {
	randolf.setPenColor(Color.green);
	}else if (color.equals("pink")) {
	randolf.setPenColor(Color.pink);
	}else if (color.equals("black")) {
	randolf.setPenColor(Color.black);
	}
	randolf.move(height);
	randolf.turn(45);
	randolf.move(10);
	randolf.turn(90);
	randolf.move(10);
	randolf.turn(45);
	randolf.move(height);
	randolf.turn(270);
	randolf.move(6);
	randolf.setPenColor(0, 150, 0);
	randolf.move(25);
	xPos = xPos + 51;
	randolf.hide();
}
}
