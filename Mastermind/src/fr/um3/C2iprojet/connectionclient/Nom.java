package fr.um3.C2iprojet.connectionclient;

import java.util.Scanner;

public class Nom {
	private String sc;
	
	public Nom () {
		Scanner s = new Scanner(System.in);
		System.out.println("Veuillez saisir votre nom:");

		String c= s.nextLine();
		
		this.sc= c;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}
}
