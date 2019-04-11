package fr.um3.c2iproject;

import java.util.Scanner;

import fr.um3.C2iprojet.connectionclient.Classement;

public class Menu {
	public int NbPartie = 0;
	public Classement clas= new Classement();
	
	
	public void creerPartie() {
		Mastermind M= new Mastermind();
		NbPartie ++;
		System.out.println(M.Consigne());
    	System.out.println(M.Jeu());
    	clas.getScore().add(M.getScore());
    	
    	
		
	}
	
	public void findepartie () {
		Scanner h = new Scanner(System.in);
		System.out.println("Voulez-vous rejouer? Si oui entrer 'J'");
		System.out.println("Voulez-vous quitter ? Si oui entrer 'Q'");
		System.out.println("Voulez-vous acceder au classement? Si oui entrer 'C'");
		String l= h.nextLine();
		if ("J".equals(l)) {
			this.creerPartie();
		}
		if("Q".equals(l)) {
			System.out.println("Aurevoir.");
			
		}
		if("C".equals(l)) {
			this.classeScore();
		}
	}

	
	public void ajoutScore() {
		
	}


	public int getNbPartie() {
		return NbPartie;
	}


	public void setNbPartie(int nbPartie) {
		NbPartie = nbPartie;
		
	}

}
