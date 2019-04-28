import org.jointheleague.graphical.robot.Robot;

public class Houses {
static int xPos = 10;
	public static void main(String[] args) {
	for (int i = 0; i < 10; i++) {
	drawHouse(xPos);
	}
	}
static void drawHouse(int startingPoint) {
	Robot randolf = new Robot();
	randolf.setSpeed(100);
	randolf.miniaturize();
	randolf.penDown();
	randolf.setPenWidth(5);
	randolf.setX(startingPoint);
	randolf.setRandomPenColor();
	randolf.move(100);
	randolf.turn(90);
	randolf.move(20);
	randolf.turn(90);
	randolf.move(100);
	randolf.turn(270);
	randolf.move(6);
	randolf.setPenColor(0, 150, 0);
	randolf.move(25);
	xPos = xPos + 51;
	randolf.hide();
}
}
