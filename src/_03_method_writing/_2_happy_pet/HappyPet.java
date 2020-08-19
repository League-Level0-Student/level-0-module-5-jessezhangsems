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
if(task==3) {
	Food();
}
if(task==4) {
	Water();
}
if (task==5) {
	Groom();
}
if (task==6) {
	Bring_To_Class();
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
	if (petlol==0) {
		JOptionPane.showMessageDialog(null, name+" appreciated it and loves you a lot!");
		happinessLevel+=2;
	}
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" appreciated it and loves you a lot!");
		happinessLevel+=2; 
	}
	if (petlol==2) {
		JOptionPane.showMessageDialog(null, name+" is very happy that its cage isn't dirty anymore!");
		happinessLevel+=3; 
	}
	if (petlol==3) {
		JOptionPane.showMessageDialog(null, name+", oh what the heck, who am I kidding?");
		happinessLevel+=0; 
	}
	if (petlol==4) {
		JOptionPane.showMessageDialog(null, name+" threw poop at you and screamed so loudly that you got a noise complaint. ");
		happinessLevel-=200;
	}
}
public static void Food() {
	if(petlol==0 ) {
		JOptionPane.showMessageDialog(null, name+" was very hungry and happily ate the food.");
		happinessLevel+=4;
	}
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" was very hungry and happily ate the food");
		happinessLevel+=4;
	}
	if (petlol==2) {
		JOptionPane.showMessageDialog(null, name+" was very hungry and happily ate the food");
		happinessLevel+=4;
	}
	if (petlol==3) {
		JOptionPane.showMessageDialog(null, name+" didn't eat your food. Why the heck did you choose rock?");
	}
	if(petlol==4) {
		JOptionPane.showMessageDialog(null, name+" didn't eat any of your food, he threw the bowl of monkey doodoo at you and gave you a prion. You died a day later. ");
		System.exit(0);
	}
}
public static void Water() { 
	if(petlol==0) {
		JOptionPane.showMessageDialog(null, name+" was very thirsty and happily drank the water. ");
		happinessLevel+=4;
	}
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" was very thirsty and happily drank the water. ");
		happinessLevel+=4;
	}
	if (petlol==2) {
		JOptionPane.showMessageDialog(null, name+" was very thirsty and happily drank the water. ");
		happinessLevel+=4;
	}
	if (petlol==3) {
		JOptionPane.showMessageDialog(null, name+" didn't drink any of the water. Saying rocks doing nothing is boring so "
				+ "yeah it danced or whatever. ");
		happinessLevel+=4;
	}
	if (petlol==4) {
		JOptionPane.showMessageDialog(null, name+" poured the water on a electrical socket, burning down the house. Everyone in the apartment died from smoked inhalation and 3rd degree burns. ");
		System.exit(0);
	}
}
public static void Groom() {
	if (petlol==0) {
		JOptionPane.showMessageDialog(null, name+" splashed around and stuff.");
		happinessLevel+=4;
	}
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" hated the bath and brushing but appreciates your concern for its lovely fur. .");
		happinessLevel+=1; 
	}
	if (petlol==2) {
		JOptionPane.showMessageDialog(null, name+" nibbled your finger while you used your hand to scrub the hay off of its back. ");
		happinessLevel+=5; 
	}
	if (petlol==3) {
		JOptionPane.showMessageDialog(null, name+" it shined like a diamond when you used the sink to wash the dirt off of its surface. ");
		happinessLevel+=0; 
	}
	if (petlol==4) {
		JOptionPane.showMessageDialog(null, name+" ripped off all of your hair and pooped on your ugly scalp.");
		happinessLevel-=100; 
	}
}
public static void Bring_To_Class() { 
	if (petlol==0) {
		JOptionPane.showMessageDialog(null, name+" made everyone happy and your classmates all fought to pet " + name);
		happinessLevel+=10;
	}
	if (petlol==1) {
		JOptionPane.showMessageDialog(null, name+" made everyone happy and your class all wanted to pet him. ");
		happinessLevel=+10;
	}
	if (petlol==2) {
		JOptionPane.showMessageDialog(null, name+" made the your class squeal and everyone looked at him while he was in his cage.");
		happinessLevel=+10;
	}
	if (petlol==3) {
		JOptionPane.showMessageDialog(null, name+" made everyone tease you for having a pet rock");
		happinessLevel-=10;
	}
	if (petlol==4) {
		JOptionPane.showMessageDialog(null, name+" killed your whole school, including you while ripping everything up. Police were called and it killed the police."
				+"\n It went on a destroying spree all around town and it currently is the evil dictator of the world, riding an evil monkey robot while crushing cities. ");
		happinessLevel-=1000000000;
	}
}



	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}