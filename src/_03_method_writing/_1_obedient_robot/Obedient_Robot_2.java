package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

  public class Obedient_Robot_2 {
	static Robot O = new Robot();
	static public void drawSquare() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			O.move(100);
			O.turn(90);
		}
		}
static public void drawTriangle() {
	for (int i = 0; i < 3; i++) {
		O.turn(45);
		O.move(100);
	}
	}
static public void drawCircle() {
	O.turn(360);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		O.penDown();
		O.setSpeed(100);
		
String input=JOptionPane.showInputDialog("Which shape do you want the robot to draw?");
if (input=="square") {
	
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}