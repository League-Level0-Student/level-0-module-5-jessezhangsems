package _03_method_writing._2_happy_pet;
import java.awt.Taskbar;

import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel=0;
	static int petlol=0;
	static String name="";
	public static void main(String[] args) {

		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 petlol = JOptionPane.showOptionDialog(null, "What pet do you want?", "Pet Shop Clerk", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Dog", "Cat", "Hamster", "Rock", "Monkey" }, null);

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "How do you want to take care of your pet? ", "Pet Shop Clerk", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Take a walk", "Clean up poop", "Food", "Water","Groom","Bring to Class" }, null);

			 name = JOptionPane.showInputDialog("What is the name of your pet going to be?");
			// 5. Use user input to call the appropriate method created in step 4.
if (task==0) {
	Cuddle();
}
if(task==1) {
	Take_A_Walk();
}
if(task==2) {
	Clean_Up_Poop();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}
public static void Cuddle() {
if (petlol==0) {
	JOptionPane.showMessageDialog(null, name+" appreciated your cuddles!");
	happinessLevel++;
}
if(petlol==1)	 {
	JOptionPane.showMessageDialog(null,name+" appreciated your cuddles!");
	happinessLevel++;
}
if (petlol==2) {
	JOptionPane.showMessageDialog(null, name+" appreciated your cuddles and ran around in his hamster wheel!");
	happinessLevel++;
}
if (petlol==3) {
	JOptionPane.showMessageDialog(null, name+" didn't respond in any way whatsoever. Maybe try a different pet?");
}
if (petlol==4) {
	JOptionPane.showMessageDialog(null, name+" ripped your face off. You died on the way to the emergency room. ");
	System.exit(0);
}
}
public static void Take_A_Walk() {
if(petlol==0) {
	JOptionPane.showMessageDialog(null, name+" wagged its tail and happily walked next to you. Strangers say aww.");
	happinessLevel+=2; 
}
if(petlol==1) {
	JOptionPane.showMessageDialog(null, name+" didn't appreeciate the walk but reluctantly followed. ");
	happinessLevel+=1;
}
if (petlol==2) {
	JOptionPane.showMessageDialog(null, "How the heck do you walk a hamster?");
}
if (petlol==3) {
	JOptionPane.showMessageDialog(null, "...");
}
if (petlol==4) {
	JOptionPane.showMessageDialog(null, name+" ran across the street, threw poop on a car windsheid, causing the car to flip over and assaults the man driving."
			+ "The man plans on suing you while slowly dying from blood loss in the ambulance. You lose a lot of money and have to give up the monkey.  ");
	happinessLevel-=10000;
	System.exit(0);
}
}
public static void Clean_Up_Poop() {
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" Your dog appreciated it and loves you a lot!");
		happinessLevel+=2;
		
		
	}
}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}