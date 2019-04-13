package fr.um3.c2iproject;

import java.util.Scanner;

import fr.um3.C2iprojet.connectionclient.Classement;
import fr.um3.C2iprojet.connectionclient.Nomclient;

public class Menu {
	public int NbPartie = 0;
	public Classement classmnt= new Classement();
	private Nomclient N= new Nomclient();
	
	
	public void creerPartie() {
		Mastermind M= new Mastermind();
		NbPartie ++;
		System.out.println(M.Consigne());
		N.NomListe();
    	System.out.println(M.Jeu());
    	classmnt.classeScore(M.getScore(), N);
    	
    	
		
	}
	
	public void findepartie () {
		Scanner h = new Scanner(System.in);
		System.out.println("Voulez-vous rejouer? Si oui entrer 'J'");
		System.out.println("Voulez-vous quitter ? Si oui entrer 'Q'");
		System.out.println("Voulez-vous acceder au classement? Si oui entrer 'C'");
		String l= h.nextLine();
		if ("J".equals(l)) {
			this.creerPartie();
			this.findepartie();
		}
		if("Q".equals(l)) {
			System.out.println("Aurevoir.");
			
		}
		if("C".equals(l)) {
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
