package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Algorithims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String prime = JOptionPane.showInputDialog("What is your number?");
int cody = Integer.parseInt(prime);
for (int i = 2; i < cody; i++) {
	if(cody % i==0) {
	JOptionPane.showMessageDialog(null, "Your number is composite!");
	System.exit(0);
	}
}
	if(cody ==2) {
	JOptionPane.showMessageDialog(null, "Your number is composite!");
System.exit(0);
}
JOptionPane.showMessageDialog(null, "Your number is prime!");
}
}