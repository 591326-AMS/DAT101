package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakter_a {
	public static void main (String [ ] args) {
		
		//innskriving av poengsum:
			String poengsumTxt = showInputDialog ("Poengsum");
			int poengsum = parseInt (poengsumTxt);
			int x = poengsum; 
		
		// Karakter gitt ut ifra poengsum:
			showInputDialog("Poengsum:");
			if (x >= 0 && x <= 100) {
				if (x >= 0 && x <= 39) {
					showMessageDialog (null, "Karakter: \nF");
					}
				if (x >= 40 && x <=49) {
					showMessageDialog (null, "Karakter: \nE");
					}
				if (x >= 50 && x <= 59) {
					showMessageDialog (null, "Karakter: \nD");
					}
				if (x >= 60 && x <= 79) {
					showMessageDialog (null, "Karakter: \nC");
					}
				if (x >= 80 && x <= 89) {
					showMessageDialog (null, "Karakter: \nB");
					}
				if (x >= 90 && x <= 100) {
					showMessageDialog (null, "Karakter: \nA");
					}
				} 
			else {
				showMessageDialog (null, "Feilmelding: \nUgyldig poengsum");
				}
		}
}
