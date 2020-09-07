package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Fakultet {
		public static void main (String[] args) {
			int n;
			boolean x; 
		
		//Innskriving fra bruker:
			do {
				String tallTxt = showInputDialog ("Regn ut fakultet til n:");
				n = parseInt (tallTxt);
				x = n < 0 ;
					if (x) {
						showMessageDialog (null, "Ugyldig verdi for n");
						}	
		    } while (x);
		
		//Utregning av n-fakultet:
				showMessageDialog (null, n + "! = " + fakultet(n));
		}
	
	public static int fakultet(int maxTall) {
		int nFak = 1;
		for (int tall = 1; tall <= maxTall; tall++)
			nFak = nFak * tall;
		return nFak;
	}
}
