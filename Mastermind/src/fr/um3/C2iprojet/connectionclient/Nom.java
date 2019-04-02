package fr.um3.C2iprojet.connectionclient;

import java.util.Scanner;

public class Nom {
	private String sc= "nom";
	
	public void Nom (String sc) {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom:");
		String c= s.nextLine();
		sc= c;
	}
}
