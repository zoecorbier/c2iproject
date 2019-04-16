package fr.um3.C2iprojet.connectionclient;

import java.util.Scanner;

public class Menu {
	public int NbPartie = 0;
	public Classement classmnt= new Classement();
	private Nomclient N= new Nomclient();
	
	
	public void creerPartie(Scanner s ) {
		Mastermind M= new Mastermind();
		NbPartie ++;
		System.out.println(M.Consigne());
		N.NomListe(s);
    	System.out.println(M.Jeu());
    	classmnt.classeScore(M.getScore(), N);
    	
    	
    	
		
	}
	
	public void findepartie (Scanner s) {
		
		System.out.println("Voulez-vous rejouer? Si oui entrer 'J'");
		System.out.println("Voulez-vous quitter ? Si oui entrer 'Q'");
		System.out.println("Voulez-vous acceder au classement? Si oui entrer 'C'");
		System.out.println("OK1");
		String c=s.nextLine();
		System.out.println("OK2");
		if ("J".equals(c)) {
			this.creerPartie(s);
			this.findepartie(s);
			
		}
		if("Q".equals(c)) {
			System.out.println("Aurevoir.");
			
		}
		if("C".equals(c)) {
			this.classmnt.AfficheClassement(N);
		}
	}

	
	public int getNbPartie() {
		return NbPartie;
	}


	public void setNbPartie(int nbPartie) {
		NbPartie = nbPartie;
		
	}

}
