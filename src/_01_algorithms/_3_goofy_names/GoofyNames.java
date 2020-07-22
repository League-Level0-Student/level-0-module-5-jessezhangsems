package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String yeet = ("");
		String goofyName = JOptionPane.showInputDialog("What is your name?");
		System.out.println(goofyName.toUpperCase());
		for (int i = 0; i < goofyName.length(); i++) {
			String reallygoofyName = goofyName.substring(i, i+1);
		if (i% 2 ==0) {
			reallygoofyName=reallygoofyName.toLowerCase();
		}
		else if (i%2==1) {
		reallygoofyName=reallygoofyName.toUpperCase();
		}
		System.out.println(reallygoofyName);
		yeet+=reallygoofyName;
		
		}

		
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name
JOptionPane.showMessageDialog(null, yeet);
	}
}

