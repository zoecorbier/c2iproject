package fr.um3.c2iproject;

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
	
	public void ajoutScore() {
		
	}


	public int getNbPartie() {
		return NbPartie;
	}


	public void setNbPartie(int nbPartie) {
		NbPartie = nbPartie;
		
	}

}
