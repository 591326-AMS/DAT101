package no.hvl.dat100;

import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*; 

public class Trinnskatt {
	public static void main(String[ ] args ) {
		
		//Bruker skriver inn bruttoinntekt:
			String bruttoinntektTxt = showInputDialog ("Bruttoinntekt");
			int brutto = parseInt(bruttoinntektTxt);
			int i = brutto;
	
		//Beregner de ulike skattetrinnene
			if ( i >= 180800) {
				if (i < 254500) {
					showMessageDialog (null, "Skattetrinn 1" );
					}
				} else {
					showMessageDialog (null, "Bruttointekt er for lav"); 
					}
			if (i >= 254500) {
				if (i < 639750) {
					showMessageDialog (null, "Skattetrinn 2");
					}
				}
			if (i >= 639750) {
				if (i < 999550) {
					showMessageDialog (null, "Skattetrinn 3");
					}
				}
			if (i >= 999550) {
				showMessageDialog (null, "Skattetrinn 4");
				}
		}
}
