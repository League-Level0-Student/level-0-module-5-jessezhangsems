package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Obedient_Robot {
	
	static Robot O = new Robot();
	public static void drawsquare() {
		
	
		// TODO Auto-generated method stub
		for (int i = 0; i < 4; i++) {
			 O.move(100);
		
			 O.turn(90);
		}
	}
public static void main(String[] args) {
 
 O.setSpeed(100);
 O.penDown();

}
	

 public static void drawtriangle() {
	 for (int i = 0; i < 3; i++) {
	 	O.turn(45);
	 	O.move(100);
	 }

}
public static void drawCircle() {
	O.turn(360);
}


 

}

